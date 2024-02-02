package AnimalExample;

import AnimalExample.Dog;

public class Bulldog extends Dog {
    public Bulldog(String name) {
        super(name);
    }

    @Override
    public void feed() {
        super.feed();
        System.out.println("but I can also chow down on almost anything!!!");
    }

    // AnimalExample.Bulldog-specific behavior or attributes ...
}
