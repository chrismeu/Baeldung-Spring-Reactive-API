package com.baeldung.baeldungspringreactiveapi.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;

/**
 * Request controller, register endpoint '/foo'
 */
@Configuration
public class FooRequestController {

    @Bean
    public RouterFunction<?> routes(FooRequestHandler fooRequestHandler) {
        return RouterFunctions.route(RequestPredicates.GET("/foo"), fooRequestHandler::streamFoo);
    }

}
