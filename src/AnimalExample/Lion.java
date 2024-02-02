package AnimalExample;

import AnimalExample.Animal;
import AnimalExample.FeedingBehavior;

public class Lion extends Animal implements FeedingBehavior {

    public Lion(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Roar!");
    }

    @Override
    public void feed() {
        System.out.println(name + " is eating meat.");
    }
}
