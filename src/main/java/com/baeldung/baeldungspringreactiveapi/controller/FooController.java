package com.baeldung.baeldungspringreactiveapi.controller;

import com.baeldung.baeldungspringreactiveapi.VO.Foo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple REST controller
 * @author chris
 * @date 2023-01-10
 */
@RestController
public class FooController {

    /**
     * API endpoint "/foo" emits a "Foo" resource every second
     * @return a Foo instance
     */
    @GetMapping( "/foo")
    public Flux<Foo> getFoo() {
        return Flux
                .fromArray(getTestDataProvider().toArray(Foo[]::new))
                .delayElements(Duration.ofSeconds(1))
                .repeat()
                .log();
    }

    /**
     * Test data (I hope the exercise was meant to be this way :)
     * @return the data provider containing many 'foo's
     */
    public static List<Foo> getTestDataProvider(){
        List<Foo> data = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            data.add(new Foo(i,"bar#"+i));
        }
        return data;
    }

}
