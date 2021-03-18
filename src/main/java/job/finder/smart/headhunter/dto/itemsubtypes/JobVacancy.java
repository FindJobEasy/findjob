package job.finder.smart.headhunter.dto.itemsubtypes;

import java.util.ArrayList;

import job.finder.smart.headhunter.dto.itemsubtypes.jobvacancysubtypes.Address;
import job.finder.smart.headhunter.dto.itemsubtypes.jobvacancysubtypes.Area;
import job.finder.smart.headhunter.dto.itemsubtypes.jobvacancysubtypes.BillingType;
import job.finder.smart.headhunter.dto.itemsubtypes.jobvacancysubtypes.Contacts;
import job.finder.smart.headhunter.dto.itemsubtypes.jobvacancysubtypes.Department;
import job.finder.smart.headhunter.dto.itemsubtypes.jobvacancysubtypes.DriverLicense;
import job.finder.smart.headhunter.dto.itemsubtypes.jobvacancysubtypes.Employer;
import job.finder.smart.headhunter.dto.itemsubtypes.jobvacancysubtypes.Employment;
import job.finder.smart.headhunter.dto.itemsubtypes.jobvacancysubtypes.Experience;
import job.finder.smart.headhunter.dto.itemsubtypes.jobvacancysubtypes.InsiderInterview;
import job.finder.smart.headhunter.dto.itemsubtypes.jobvacancysubtypes.Salary;
import job.finder.smart.headhunter.dto.itemsubtypes.jobvacancysubtypes.Schedule;
import job.finder.smart.headhunter.dto.itemsubtypes.jobvacancysubtypes.Skill;
import job.finder.smart.headhunter.dto.itemsubtypes.jobvacancysubtypes.Specialization;
import job.finder.smart.headhunter.dto.itemsubtypes.jobvacancysubtypes.Test;
import job.finder.smart.headhunter.dto.itemsubtypes.jobvacancysubtypes.Type;
import job.finder.smart.headhunter.dto.itemsubtypes.jobvacancysubtypes.WorkingDays;
import job.finder.smart.headhunter.dto.itemsubtypes.jobvacancysubtypes.WorkingTimeIntervals;
import job.finder.smart.headhunter.dto.itemsubtypes.jobvacancysubtypes.WorkingTimeModes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobVacancy
{
    private String id;
    private String description;
    private String branded_description;
    private ArrayList<Skill> key_skills;
    private Schedule schedule;
    private Boolean accept_handicapped;
    private Boolean accept_kids;
    private Experience experience;
    private Address address;
    private String alternate_url;
    private String apply_alternate_url;
    private String code;
    private Department department;
    private Employment employment;
    private Salary salary;
    private Boolean archived;
    private String name;
    private InsiderInterview insider_interview;
    private Area area;
    private String created_at;
    private String published_at;
    private Employer employer;
    private Boolean response_letter_required;
    private Type type;
    private Boolean has_test;
    private String response_url;
    private Test test;
    private ArrayList<Specialization> specializations;
    private Contacts contacts;
    private BillingType billing_type;
    private Boolean allow_messages;
    private Boolean premium;
    private ArrayList<DriverLicense> driver_license_types;
    private Boolean accept_incomplete_resumes;
    private ArrayList<WorkingDays> working_days;
    private ArrayList<WorkingTimeIntervals> working_time_intervals;
    private ArrayList<WorkingTimeModes> working_time_modes;
    private Boolean accept_temporary;
}
