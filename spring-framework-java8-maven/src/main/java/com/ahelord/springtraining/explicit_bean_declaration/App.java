package com.ahelord.springtraining.explicit_bean_declaration;

public class App {
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
}
