package com.ahelord.springtraining.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class ProdEnv implements EnvService {
    @Override
    public String getEnv() {
        return "ProdEnv";
    }
}
