package dev.vaghekev.springsecuritydemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/access/")
    private String hello() {
        return "Hello World 123 123";
    }



}
