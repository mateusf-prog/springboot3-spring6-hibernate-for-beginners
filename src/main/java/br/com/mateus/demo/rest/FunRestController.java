package br.com.mateus.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // inject properties for: coach.name and team.name
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;


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

    @GetMapping("/teaminfo")
    public String getCoachName() {
        return "Coach: " + coachName + ", team name: " + teamName;
    }

}
