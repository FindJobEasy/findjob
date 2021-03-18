package job.finder.smart.headhunter.dto;

import java.util.ArrayList;

import job.finder.smart.headhunter.dto.itemsubtypes.JobVacancy;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Items
{
    private ArrayList<JobVacancy> items;
    private Long found;
    private Long pages;
    private Long per_page;
    private Long page;
    private String clusters;
    private String arguments;
    private String alternate_url;
}

