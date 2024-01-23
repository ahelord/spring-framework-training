package com.ahelord.springtraining.qualifiers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal{

    public Dog(@Value("1") Integer years, @Value("Rocky") String name) {
        super(years, name);
    }
}
