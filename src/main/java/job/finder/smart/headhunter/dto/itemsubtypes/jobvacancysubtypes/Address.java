package job.finder.smart.headhunter.dto.itemsubtypes.jobvacancysubtypes;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address
{
    private String city;
    private String street;
    private String building;
    private String description;
    private Long lat;
    private Long lng;
    private ArrayList<MetroStation> metro_stations;
}
