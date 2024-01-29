package com.ahelord.springtraining.life_cycle.lazy;

import com.ahelord.springtraining.life_cycle.LifeCycle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@Component
@Lazy(false)
public class BeanB {

    @Autowired
    private BeanA beanA;
    private static final Logger log = LoggerFactory.getLogger(BeanB.class);

    @PostConstruct
    public void init() {
        log.info("BeanB init");
    }
}
