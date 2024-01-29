package com.ahelord.springtraining.life_cycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/life-cycle")
public class LifeCycleController {

    @Autowired
    private LifeCycle lifeCycle;

    @GetMapping
    public ResponseEntity<String> getLifeCycle(){
        return  new ResponseEntity<>("l", HttpStatus.OK);
    }
}
