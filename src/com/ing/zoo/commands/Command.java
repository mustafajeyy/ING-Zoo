package com.ing.zoo.commands;

import com.ing.zoo.animals.Animal;

import java.util.List;

public interface Command {
    void execute(List<Animal> animals, String argument);
}
