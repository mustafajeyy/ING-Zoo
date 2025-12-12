
package com.ing.zoo.commands;

import com.ing.zoo.animals.Animal;

import java.util.List;

public class HelloCommand implements Command {

    @Override
    public void execute(List<Animal> animals, String argument) {
        for (Animal animal: animals) {
            if (argument == null || animal.getName().equalsIgnoreCase(argument)) {
                System.out.print(animal.getName() + ": ");
                animal.sayHello();
            }
        }
    }
}
