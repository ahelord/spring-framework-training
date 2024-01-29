package com.ahelord.springtraining.life_cycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Lazy
public class LifeCycle implements BeanNameAware, InitializingBean, DisposableBean {
    private static final Logger log = LoggerFactory.getLogger(LifeCycle.class);

    @Override
    public void setBeanName(String name) {

        log.info("LifeCycle Bean name aware {}", name);
    }

    @PostConstruct
    public void init(){
        log.info("LifeCycle Bean PostConstruct");

    }

    @PreDestroy
    public void destroyBean(){

        log.info("LifeCycle Bean PreDestroy");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("LifeCycle After property set method");

    }

    @Override
    public void destroy() throws Exception {
        log.info("LifeCycle destroy method");

    }
}
