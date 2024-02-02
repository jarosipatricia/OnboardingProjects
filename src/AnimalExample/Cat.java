package AnimalExample;

import AnimalExample.Animal;
import AnimalExample.FeedingBehavior;

public class Cat extends Animal implements FeedingBehavior {

    public Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Meow!");
    }

    @Override
    public void feed() {
        System.out.println(name + " is eating fish and milk.");
    }
}