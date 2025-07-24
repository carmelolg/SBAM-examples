package it.carmelolagamba.sbam.integration.http;

import it.carmelolagamba.sbam.common.config.JsonPlaceholderProperties;
import it.carmelolagamba.sbam.integration.http.entity.User;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Component
@Slf4j
@AllArgsConstructor
public class UserRetriever implements Retriever{

    private final JsonPlaceholderProperties jsonPlaceholderProperties;

    public List<User> get() {

        HttpHeaders headers = new HttpHeaders(jsonPlaceholderProperties.getDefaultHeaders());


        WebClient client = WebClient.builder()
                .baseUrl(jsonPlaceholderProperties.getBaseUrl())
                .defaultHeaders(httpHeaders -> httpHeaders.addAll(headers))
                .build();

        List<User> users = client.get().uri("/users").retrieve().bodyToMono(new ParameterizedTypeReference<List<User>>() {})
                .doOnError(error -> log.error("Error fetching users: {}", error.getMessage()))
                .doOnSuccess(list -> log.info("Fetched users: {}", list))
                .block();;

        return users;
    }

}
