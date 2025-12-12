package com.ing.zoo;

import com.ing.zoo.animals.*;
import com.ing.zoo.commands.*;

import java.util.*;

public class Zoo {
    public static void main(String[] args)
    {
        // Map met alle commands
        Map<String, Command> commands = new HashMap<>();
        commands.put("hello", new HelloCommand());
        commands.put("give meat", new GiveMeatCommand());
        commands.put("give leaves", new GiveLeavesCommand());
        commands.put("perform trick", new PerformTrickCommand());

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

        // Command loop
        while (true) {
            System.out.print("Voer uw command in: ");
            String input = scanner.nextLine().trim();

            // Exit command
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Tot ziens!");
                break;
            }

            String commandName = input;
            String argument = null;

            // Split command en argument
            for (String key : commands.keySet()) {
                if (input.startsWith(key)) {
                    commandName = key;
                    argument = input.length() > key.length() ? input.substring(key.length()).trim() : null;
                    break;
                }
            }

            Command command = commands.get(commandName);

            if (command != null) {
                command.execute(animals, argument);
            }
            else {
                System.out.println("Unknown command: " + input);
            }
        }

        scanner.close();
    }
}