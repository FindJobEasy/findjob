package job.finder.smart.headhunter.mapper;

import org.springframework.stereotype.Component;

import job.finder.smart.headhunter.dao.entity.JobVacancyEntity;
import job.finder.smart.headhunter.dto.itemsubtypes.JobVacancy;

@Component
public class JobVacancyDto2EntityMapper implements Dto2EntityMapper<JobVacancy, JobVacancyEntity>
{
    @Override
    public JobVacancyEntity map(final JobVacancy dto)
    {
        return JobVacancyEntity.builder()
                .vacancyId(dto.getId())
                .contacts(String.valueOf(dto.getContacts()))
                .experience(String.valueOf(dto.getExperience()))
                .keySkills(String.valueOf(dto.getKey_skills()))
                .salary(String.valueOf(dto.getSalary()))
                .code(dto.getCode())
                .build();
    }
}
