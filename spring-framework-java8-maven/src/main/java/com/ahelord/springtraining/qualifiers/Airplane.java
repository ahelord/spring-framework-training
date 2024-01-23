package com.ahelord.springtraining.qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Airplane implements Flyer {
    private static final Logger log = LoggerFactory.getLogger(Airplane.class);

    @Override
    public void fly() {
        log.info("I am airplane and flying");
    }
}
