package job.finder.smart.controller;


import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import job.finder.smart.VacancySubscriber;
import job.finder.smart.headhunter.dao.JobVacanciesRepository;
import job.finder.smart.headhunter.dao.entity.JobVacancyEntity;
import job.finder.smart.headhunter.dto.Items;
import job.finder.smart.headhunter.dto.itemsubtypes.JobVacancy;
import job.finder.smart.headhunter.mapper.Dto2EntityMapper;
import job.finder.smart.webclient.JobVacanciesWebClient;
import lombok.SneakyThrows;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/")
public class JobVacanciesController
{
    private final JobVacanciesRepository jobVacanciesRepository;
    private final Dto2EntityMapper<JobVacancy, JobVacancyEntity> jobVacancyDto2EntityMapper;
    private final VacancySubscriber vacancySubscriber;

    public JobVacanciesController(JobVacanciesRepository jobVacanciesRepository, Dto2EntityMapper<JobVacancy,
            JobVacancyEntity> jobVacancyDto2EntityMapper, VacancySubscriber vacancySubscriber)
    {
        this.jobVacanciesRepository = jobVacanciesRepository;
        this.jobVacancyDto2EntityMapper = jobVacancyDto2EntityMapper;
        this.vacancySubscriber = vacancySubscriber;
    }

    @SneakyThrows
    @GetMapping(value = "save")
    private void saveAllJobVacancies()
    {
        JobVacanciesWebClient jobVacanciesWebClient = new JobVacanciesWebClient();
        final Mono<Items> items = jobVacanciesWebClient.getItems();
        final CompletableFuture<Items> itemsCompletableFuture = items.log().toFuture();
        if (itemsCompletableFuture.isDone())
        {
            final List<JobVacancyEntity> vacancies = itemsCompletableFuture.get().getItems().stream()
                    .map(jobVacancyDto2EntityMapper::map)
                    .collect(Collectors.toList());
            jobVacanciesRepository.saveAll(vacancies).subscribe(System.out::println);

        }

        items.subscribe(vacancySubscriber::sub);
    }

    @GetMapping(value = "get")
    private void getAllJobVacancies()
    {
        System.out.println(jobVacanciesRepository.findAll().subscribe(System.out::println));
    }
}
