package com.ing.zoo.animals;

import com.ing.zoo.behavior.Herbivore;
import com.ing.zoo.behavior.Trickable;
import java.util.Random;

public class Monkey extends Animal implements Herbivore, Trickable {
    public String helloText;
    public String eatText;
    public String trick;

    public Monkey(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        helloText = "ooh ooh ah ah";
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves() {
        eatText = "nom nom banana leaves yum";
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(3);
        if (rnd == 0) {
            trick = "swings from branch to branch";
        } else if (rnd == 1) {
            trick = "peels a banana";
        } else {
            trick = "does a backflip";
        }
        System.out.println(trick);
    }
}