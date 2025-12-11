package com.ing.zoo.animals;

import com.ing.zoo.behavior.Carnivore;
import com.ing.zoo.behavior.Trickable;

import java.util.Random;

public class Tiger extends Animal implements Carnivore, Trickable {
    public String helloText;
    public String eatText;
    public String trick;

    public Tiger(String name)
    {
        super(name);
    }

    @Override
    public void sayHello()
    {
        helloText = "rraaarww";
        System.out.println(helloText);
    }

    @Override
    public void eatMeat()
    {
        eatText = "nomnomnom oink wubalubadubdub";
        System.out.println(eatText);
    }

    @Override
    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "jumps in tree";
        }
        else
        {
            trick = "scratches ears";
        }
        System.out.println(trick);
    }
}
