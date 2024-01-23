package com.ahelord.springtraining.qualifiers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bird extends Animal implements Flyer{

    private static final Logger log = LoggerFactory.getLogger(Bird.class);

    public Bird(@Value("2") Integer years, @Value("Albert") String name) {
        super(years, name);
    }

    @Override
    public void fly() {
        log.info("Iam bird and flying");

    }
}
