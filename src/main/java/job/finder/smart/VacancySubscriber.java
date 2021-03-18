package job.finder.smart;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import job.finder.smart.headhunter.dao.JobVacanciesRepository;
import job.finder.smart.headhunter.dao.entity.JobVacancyEntity;
import job.finder.smart.headhunter.dto.Items;
import job.finder.smart.headhunter.dto.itemsubtypes.JobVacancy;
import job.finder.smart.headhunter.mapper.Dto2EntityMapper;

@Component
public class VacancySubscriber
{
    private final JobVacanciesRepository jobVacanciesRepository;
    private final Dto2EntityMapper<JobVacancy, JobVacancyEntity> jobVacancyDto2EntityMapper;

    public VacancySubscriber(final JobVacanciesRepository jobVacanciesRepository, final Dto2EntityMapper<JobVacancy, JobVacancyEntity> jobVacancyDto2EntityMapper)
    {
        this.jobVacanciesRepository = jobVacanciesRepository;
        this.jobVacancyDto2EntityMapper = jobVacancyDto2EntityMapper;
    }

    public void sub(Items items)
    {
        final List<JobVacancyEntity> collect = items.getItems().stream()
                .map(jobVacancyDto2EntityMapper::map)
                .collect(Collectors.toList());

        jobVacanciesRepository.saveAll(collect).subscribe();
    }
}
