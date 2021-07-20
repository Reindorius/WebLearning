package com.reindorius.pojo;

import org.springframework.beans.factory.annotation.Value;

public class User {
    private String name;

    public String getName() {
        return name;
    }

    @Value("Reindorius")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name - " + name;
    }
}
