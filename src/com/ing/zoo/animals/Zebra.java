package com.ing.zoo.animals;

public class Zebra extends Animal {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Zebra()
    {
    }

    @Override
    public void sayHello()
    {
        helloText = "zebra zebra";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch zank yee bra";
        System.out.println(eatText);
    }
}
