package com.springboot.helloworld;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String helloWorld() {
        return "Hello World from Spring Boot web app. \n";
    }

    @RequestMapping("/goodbye")
    public String goodbye(){
        return "Goodbye from Spring Boot. \n";
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "name", defaultValue = "Java") String name){
        return String.format("Hello, it's a pleasure to meet you %s! \n", name);
    }
}
