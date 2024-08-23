package com.ecom.greetrest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetController {
    AtomicLong counter = new AtomicLong();
    String template = "Hello, %s!";

    @GetMapping("/greet")
    public GreetRecord greetUser(@RequestParam(value = "name", defaultValue = "our user") String name) {
        return new GreetRecord(counter.incrementAndGet(), String.format(template,name));
    }

    //See application.properties for app running port #

}
