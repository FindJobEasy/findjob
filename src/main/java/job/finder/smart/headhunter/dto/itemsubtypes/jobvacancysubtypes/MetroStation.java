package job.finder.smart.headhunter.dto.itemsubtypes.jobvacancysubtypes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MetroStation
{
    private String station_id;
    private String station_name;
    private String line_id;
    private String line_name;
    private Long lat;
    private Long lng;

}
