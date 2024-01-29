package com.ahelord.springtraining.life_cycle.lazy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Lazy
public class BeanA {
    private static final Logger log = LoggerFactory.getLogger(BeanA.class);


    @PostConstruct
    public void init() {
        log.info("BeanA init");
    }
}
