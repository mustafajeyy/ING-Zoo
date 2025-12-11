package com.ing.zoo.animals;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println(name + " zegt hallo!");
    }

    public String getName() {
        return name;
    }
}
