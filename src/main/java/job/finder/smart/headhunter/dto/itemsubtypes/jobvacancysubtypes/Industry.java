package job.finder.smart.headhunter.dto.itemsubtypes.jobvacancysubtypes;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Industry
{
    private String id;
    private String name;
    private ArrayList<Industry> industries;
}
