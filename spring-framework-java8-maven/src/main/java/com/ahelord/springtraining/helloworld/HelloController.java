package com.ahelord.springtraining.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.SpringVersion;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class HelloController {

    @Autowired
    private Informer informer;
    @GetMapping("/hello-with-version")
    public String getHelloWithVersion() {
        return "Greetings from Spring Boot!"+ informer.getSpringVersion();
    }

    @GetMapping
    public ResponseEntity<String> getHello(){
        return new ResponseEntity<>("Hello world",HttpStatus.OK);
    }

}