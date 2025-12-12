package com.ing.zoo.commands;

import com.ing.zoo.animals.Animal;
import com.ing.zoo.behavior.Trickable;

import java.util.List;

public class PerformTrickCommand implements Command {

    @Override
    public void execute(List<Animal> animals, String argument) {
        for (Animal animal : animals) {
            if (animal instanceof Trickable) {
                System.out.print(animal.getName() + ": ");
                ((Trickable) animal).performTrick();
            }
        }
    }
}
