package AnimalExample;

import AnimalExample.Animal;
import AnimalExample.FeedingBehavior;

public class Dog extends Animal implements FeedingBehavior {

    public Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Woof!");
    }

    @Override
    public void feed() {
        System.out.println(name + " is eating dog food.");
    }
}
