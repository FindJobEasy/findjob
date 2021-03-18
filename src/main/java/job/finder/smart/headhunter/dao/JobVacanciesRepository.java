package job.finder.smart.headhunter.dao;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import job.finder.smart.headhunter.dao.entity.JobVacancyEntity;

@Repository
public interface JobVacanciesRepository extends ReactiveCrudRepository<JobVacancyEntity, Long>
{
}
