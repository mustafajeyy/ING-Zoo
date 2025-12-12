package com.ing.zoo;

import com.ing.zoo.animals.*;
import com.ing.zoo.behavior.Carnivore;
import com.ing.zoo.behavior.Herbivore;
import com.ing.zoo.behavior.Trickable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args)
    {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        // Lijst met alle dieren
        List<Animal> animals = new ArrayList<>();

        Lion henk = new Lion("henk");
        animals.add(henk);

        Hippo elsa = new Hippo("elsa");
        animals.add(elsa);

        Pig dora = new Pig("dora");
        animals.add(dora);

        Tiger wally = new Tiger("wally");
        animals.add(wally);

        Zebra marty = new Zebra("marty");
        animals.add(marty);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();
        String[] parts = input.split(" ", 2);

        if(parts[0].equals(commands[0]))
        {
            String name = parts.length > 1 ? parts[1] : null;

            for(Animal animal : animals)
            {
                if (name == null || animal.getName().equals(name))
                {
                    animal.sayHello();
                }
            }
        }
        else if(input.equals(commands[1]))
        {
            for(Animal animal : animals)
            {
                if(animal instanceof Herbivore)
                {
                    ((Herbivore) animal).eatLeaves();
                }
            }
        }
        else if(input.equals(commands[2]))
        {
            for(Animal animal : animals)
            {
                if(animal instanceof Carnivore)
                {
                    ((Carnivore) animal).eatMeat();
                }
            }
        }
        else if(input.equals(commands[3]))
        {
            for(Animal animal : animals)
            {
                if(animal instanceof Trickable)
                {
                    ((Trickable) animal).performTrick();
                }
            }
        }
        else
        {
            System.out.println("Unknown command: " + input);
        }
    }
}