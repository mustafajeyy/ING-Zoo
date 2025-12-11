package com.ing.zoo.animals;

import com.ing.zoo.behavior.Herbivore;

public class Zebra extends Animal implements Herbivore {
    public String helloText;
    public String eatText;

    public Zebra(String name)
    {
        super(name);
    }

    @Override
    public void sayHello()
    {
        helloText = "zebra zebra";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }
}
