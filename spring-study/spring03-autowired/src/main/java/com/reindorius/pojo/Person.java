package com.reindorius.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class Person {
    @Resource(name = "anotherCat")
    private Cat cat;
    private Dog dog;
    private String name;

    public Person() {
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    @Autowired
    @Qualifier(value = "someOtherDog")
    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name - " + name + "\nDog - " + dog.toString() + "\nCat - " + cat.toString();
    }
}
