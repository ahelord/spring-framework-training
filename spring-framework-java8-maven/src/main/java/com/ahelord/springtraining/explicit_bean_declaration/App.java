package com.ahelord.springtraining.explicit_bean_declaration;

import com.ahelord.springtraining.life_cycle.LifeCycle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class App {
    private static final Logger log = LoggerFactory.getLogger(LifeCycle.class);

    private String name;

    public App(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void init(){
        log.info("Explicit Bean App PostConstruct");

    }

    public void destroy(){

        log.info("Explicit Bean App PreDestroy");

    }
}
