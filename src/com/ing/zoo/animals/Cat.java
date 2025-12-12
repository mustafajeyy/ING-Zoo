package com.ing.zoo.animals;

import com.ing.zoo.behavior.Carnivore;
import com.ing.zoo.behavior.Trickable;

public class Cat extends Animal implements Carnivore, Trickable {
    public String helloText;
    public String eatText;
    public String trick;

    public Cat(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        helloText = "meow meow";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat() {
        eatText = "nom nom purrrr";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        trick = "rolls on back";
        System.out.println(trick);
    }
}
