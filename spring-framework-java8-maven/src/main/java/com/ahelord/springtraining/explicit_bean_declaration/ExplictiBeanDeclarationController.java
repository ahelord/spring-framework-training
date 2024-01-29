package com.ahelord.springtraining.explicit_bean_declaration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/explicit-bean-declaration")
public class ExplictiBeanDeclarationController {



    @Bean
    public App getApp(){
        return new App("My bean with default config");
    }

    @Autowired
    private App app;

    @GetMapping
    public ResponseEntity<String> getAppName(){


        return new ResponseEntity<>(this.app.getName(), HttpStatus.OK);
    }
}
