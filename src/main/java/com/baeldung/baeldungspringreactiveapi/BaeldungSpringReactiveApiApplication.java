package com.baeldung.baeldungspringreactiveapi;

import com.baeldung.baeldungspringreactiveapi.webclient.FooWebClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Simple Spring Boot App (using Spring Boot 2.7.7)
 * @author chris
 * @date 2023-01-10
 */
@SpringBootApplication
public class BaeldungSpringReactiveApiApplication {

    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(BaeldungSpringReactiveApiApplication.class, args);

        // Testing: Start the web client here
        FooWebClient fooWebClient = new FooWebClient();
        fooWebClient.subscribe();
    }

}
