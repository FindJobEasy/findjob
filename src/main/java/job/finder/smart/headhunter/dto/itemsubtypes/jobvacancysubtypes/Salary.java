package job.finder.smart.headhunter.dto.itemsubtypes.jobvacancysubtypes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Salary
{
    private String from;
    private String to;
    private Boolean gross;
    private String currency;
}
