package AnimalExample;

public abstract class Animal {

    //encapsulating shared attributes and methods such as name and sleep
    String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void makeSound();

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

