package com.baeldung.baeldungspringreactiveapi.controller;

import com.baeldung.baeldungspringreactiveapi.data.FooService;
import com.baeldung.baeldungspringreactiveapi.data.VO.Foo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * Simple request handler
 * @author chris
 * @date 2023-01-10
 */
@Component
public class FooRequestHandler {

    @Autowired
    private FooService fooService;

    /**
     * Handle request
     * @param request
     * @return
     */
    public Mono<ServerResponse> streamFoo(ServerRequest request) {
        return ServerResponse.ok()
                .contentType(MediaType.TEXT_EVENT_STREAM)
                .body(fooService.getFooStream(), Foo.class);
    }

}
