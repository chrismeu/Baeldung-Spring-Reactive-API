package com.baeldung.baeldungspringreactiveapi.webclient;

import com.baeldung.baeldungspringreactiveapi.VO.Foo;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

/**
 * Simple, non-blocking web client (from Spring 5)
 * @author chris
 * @date 2023-01-10
 */
public class FooWebClient {

    private final WebClient simpleClient = WebClient.create("http://localhost:8080");

    /**
     * Consume the 'foo's
     */
    public void subscribe(){
        Flux<Foo> fooFlux = simpleClient.get()
                .uri("/foo")
                .retrieve()
                .bodyToFlux(Foo.class);

        fooFlux.subscribe(System.out::println);
    }

}
