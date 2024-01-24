package com.ahelord.springtraining.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("qa")
public class QaEnv implements EnvService{
    @Override
    public String getEnv() {
        return "QaEnv";
    }
}
