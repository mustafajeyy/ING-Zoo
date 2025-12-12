package com.ing.zoo.commands;

import com.ing.zoo.animals.Animal;
import com.ing.zoo.behavior.Carnivore;

import java.util.List;

public class GiveMeatCommand implements Command {

    @Override
    public void execute(List<Animal> animals, String argument) {
        for (Animal animal : animals) {
            if (animal instanceof Carnivore) {
                System.out.print(animal.getName() + ": ");
                ((Carnivore) animal).eatMeat();
            }
        }
    }
}
