package com.ahelord.springtraining.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"dev","default"})
public class DevEnv implements EnvService{
    @Override
    public String getEnv() {
        return "DevEnv";
    }
}
