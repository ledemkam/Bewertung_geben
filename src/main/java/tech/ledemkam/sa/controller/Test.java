package tech.ledemkam.sa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "test")
public class Test {
    @GetMapping(path = "get-string")
    public String gestString() {
        return "Hello World!";
    }
}
