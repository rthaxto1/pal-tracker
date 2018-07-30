package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    public String hello;

    public WelcomeController( @Value("${WELCOME_MESSAGE}")String message) {
        this.hello = message;
    }

    @GetMapping("/")
    public String sayHello() {
        //String hello =  "hello";
        return this.hello;
    }
}

