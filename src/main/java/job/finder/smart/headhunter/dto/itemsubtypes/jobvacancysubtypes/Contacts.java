package job.finder.smart.headhunter.dto.itemsubtypes.jobvacancysubtypes;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contacts
{
    private String name;
    private String email;
    private ArrayList<Phones> phones;
}
