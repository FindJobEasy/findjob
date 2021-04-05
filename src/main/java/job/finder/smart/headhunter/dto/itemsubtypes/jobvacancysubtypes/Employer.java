package job.finder.smart.headhunter.dto.itemsubtypes.jobvacancysubtypes;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employer
{
    private String id;
    private String name;
    private String type;
    private String site_url;
    private String description;
    private String branded_description;
    private String vacancies_ull;
    private Long open_vacancies;
    private Boolean trusted;
    private String alternate_url;
    private ArrayList<InsiderInterview> insiderInterviews;
    private Object logo_urls;
    private Area area;
    private ArrayList<String> relations;
    private ArrayList<Industry> industries;
    private Boolean blacklisted;
}
