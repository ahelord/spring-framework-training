package com.ahelord.springtraining.helloworld;

import org.springframework.core.SpringVersion;
import org.springframework.stereotype.Component;

@Component
public class Informer {
    public String getSpringVersion(){
        return SpringVersion.getVersion();
    }
}
