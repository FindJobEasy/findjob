package job.finder.smart.headhunter.dao.entity;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobVacancyEntity
{
    @Id
    private Long id;
    private String vacancyId;
    private String description;
    private String brandedDescription;
    private String keySkills;
    private String experience;
    private String alternate_url;
    private String apply_alternate_url;
    private String code;
    private String salary;
    private Boolean archived;
    private String name;
    private String created_at;
    private String published_at;
    private Boolean response_letter_required;
    private String contacts;
}
