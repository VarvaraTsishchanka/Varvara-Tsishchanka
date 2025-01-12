package lesson4;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();

        Cat fluffy = new Cat("Fluffy");
        Dog bobby = new Dog("Bobby");
        Cat fluffy1 = new Cat("Fluffy");
        Dog bobby1 = new Dog("Bobby");
        fluffy.run(150);
        fluffy.run(201);

        bobby.run(500);
        bobby.run(501);

        fluffy.swim(10);
        fluffy.swim(0);

        bobby.swim(10);
        bobby.swim(11);
        System.out.println("Total animals: " +Animal.getCountAnimal());
        System.out.println("Total cats: "+Cat.getCountCat());
        System.out.println("Total dogs: "+Dog.getCountDog());



    }
}
