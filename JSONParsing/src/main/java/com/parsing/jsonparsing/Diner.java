package com.parsing.jsonparsing;

import org.json.simple.JSONAware;

public class Diner implements JSONAware {

    private String name;
    private int age;
    private String gender;
    private long amountSpent;

    public Diner(String name, int age, String gender, long amountSpent) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.amountSpent = amountSpent;
    }

    @Override
    public String toJSONString() {
        return String.format("{\nname: %s, \nage: %d, \ngender: %s, \namountSpent: %d}\n", name, age, gender, amountSpent);
    }
}
