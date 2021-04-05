package job.finder.smart.webclient;

import org.springframework.web.reactive.function.client.WebClient;

import job.finder.smart.headhunter.dto.Items;
import reactor.core.publisher.Mono;

public class JobVacanciesWebClient
{
    WebClient client = WebClient.create("https://api.hh.ru");

    public Mono<Items> getItems()
    {
        return client.get()
                .uri("/vacancies")
                .retrieve()
                .bodyToMono(Items.class);
    }
}
