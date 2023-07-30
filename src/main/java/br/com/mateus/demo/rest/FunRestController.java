package br.com.mateus.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/test")
    public String testPage() {
        return "Page test!";
    }

    @GetMapping("/fortune")
    public String fortunePage() {
        return "5 billion dollars!";
    }
}
