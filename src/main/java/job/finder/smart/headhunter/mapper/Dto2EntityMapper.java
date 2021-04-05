package job.finder.smart.headhunter.mapper;

public interface Dto2EntityMapper<FROM, TO>
{
    TO map(FROM dto);
}
