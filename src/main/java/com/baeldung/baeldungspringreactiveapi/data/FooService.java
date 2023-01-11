package com.baeldung.baeldungspringreactiveapi.data;

import com.baeldung.baeldungspringreactiveapi.data.VO.Foo;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

/**
 * Foo service
 * @author Chris
 * @date 2023-01-10
 */
@Service
public class FooService {

    /**
     * Data 01: Get generated foo data stream
     * @return
     */
    public Flux<Foo> getFooStream() {
        return Flux.zip(
                Flux.fromStream(Stream.generate(() -> new Foo(UUID.randomUUID().toString(), "bar"))),
                Flux.interval(Duration.ofSeconds(1)),
                (s1,s2) -> s1
        );
    }

    /**
     * Data 02: Get generated foo data array
     * @return
     */
    public Flux<Foo> getFooArray() {
        return Flux
                .fromArray(getTestDataProvider().toArray(Foo[]::new))
                .delayElements(Duration.ofSeconds(1))
                .repeat();
    }

    /**
     * Test data (I hope the exercise was meant to be this way :)
     * @return the data provider containing many 'foo's
     */
    private static List<Foo> getTestDataProvider(){
        List<Foo> data = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            data.add(new Foo(i+"","bar#"+i));
        }
        return data;
    }

}
