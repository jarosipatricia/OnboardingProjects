package AnimalExample;

import AnimalExample.Bulldog;
import AnimalExample.Cat;
import AnimalExample.Dog;
import AnimalExample.Lion;

public class Main {
    public static void main(String[] args) {

        Lion lion = new Lion("Simba");
        Dog dog = new Dog("Jerry");
        Cat cat = new Cat("Whiskers");


        Bulldog bulldog = new Bulldog("Rocky");

        // Using common behavior
        lion.makeSound();
        lion.sleep();

        dog.makeSound();
        dog.sleep();

        cat.makeSound();
        cat.sleep();

        bulldog.makeSound();
        bulldog.sleep();

        // Using feeding behavior
        lion.feed();
        dog.feed();
        cat.feed();
        bulldog.feed();
    }
}









/*public class AnimalExample.Main {
    public static void main(String[] args) {

        int i = 1;
        MyWrapper obj = new MyWrapper(5);

        System.out.println("First time, value: " + i);
        i = addOne(i);
        System.out.println("After method, value: " + i);

        System.out.println("First time, ref: " + obj.i);
        obj.addOne(obj);
        System.out.println("After method, ref: " + obj.i);

    }
    public static int addOne(int i) {
        return i+1;
    }
}

    class MyWrapper {
        int i;
        public MyWrapper(int i) {
            this.i = i;
        }
        public void addOne(MyWrapper obj) {
            obj.i = obj.i +1;
            //this.i = i + 1;
        }
} */








/*System.out.println("Hello world!");
        AnimalExample.Book book = new AnimalExample.Book("Title1");
        AnimalExample.Book book2 = new AnimalExample.Book("Title1");
        System.out.println(book.equals(book2));
        System.out.println(book == book2);

        HashMap<AnimalExample.Book, Integer> map = new HashMap<>();
        map.put(book, 2);
        map.put(book2, 3);
        map.put(book, 4);
        System.out.println(map.keySet().size());
        System.out.println(book);
        System.out.println(book2);
        //CTRl+D for copying a line */


        /*
        //create list
        List<String> fruits = new ArrayList<>();
        fruits.add("mango");
        fruits.add("orange");
        fruits.add("Grapes");
        System.out.println(fruits.get(1)); //Print element at index 1
        fruits.set(0, "banana"); //Replace 0th element with banana
        fruits.add(1,"fruit1"); //add fruit1 to index 1
        System.out.println(fruits.indexOf("banana"));//print first occurrence of 2 is at index
        fruits.remove("Grapes"); //or fruits.remove(3) through index

        for (String fruit : fruits)
            System.out.println(fruit);

        /*for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }*/

        /*
        // Set demonstration using HashSet
        Set<String> Set = new HashSet<String>();
        // Adding Elements
        Set.add("one");
        Set.add("two");
        Set.add("three");
        Set.add("three");
        // Set follows unordered way.
        System.out.println(Set);


        // Creating object for Map.
        Map<Integer, String> map = new HashMap<Integer, String>();
        // Adding Elements using Map.
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");
        // Elements can traverse in any order
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        } */