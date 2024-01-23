package com.ahelord.springtraining.qualifiers;

public abstract class Animal {
    private Integer years;
    private String name;

    public Animal(Integer years, String name) {
        this.years = years;
        this.name = name;
    }

    public Integer getYears() {
        return years;
    }

    public void setYears(Integer years) {
        this.years = years;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
