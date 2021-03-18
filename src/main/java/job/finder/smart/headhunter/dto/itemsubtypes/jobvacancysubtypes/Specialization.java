package job.finder.smart.headhunter.dto.itemsubtypes.jobvacancysubtypes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Specialization
{
    private String id;
    private String name;
    private String profarea_id;
    private String profarea_name;
}
