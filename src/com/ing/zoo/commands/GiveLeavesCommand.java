package com.ing.zoo.commands;

import com.ing.zoo.animals.Animal;
import com.ing.zoo.behavior.Herbivore;

import java.util.List;

public class GiveLeavesCommand implements Command {

    @Override
    public void execute(List<Animal> animals, String argument) {
        for (Animal animal : animals) {
            if (animal instanceof Herbivore) {
                System.out.print(animal.getName() + ": ");
                ((Herbivore) animal).eatLeaves();
            }
        }
    }
}
