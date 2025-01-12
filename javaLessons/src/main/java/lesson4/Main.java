package lesson4;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();

        Cat fluffy = new Cat("Fluffy");
        Dog bobby = new Dog("Bobby");
        fluffy.run(200);
        fluffy.run(201);

        bobby.run(500);
        bobby.run(501);

        fluffy.swim(10);

        bobby.swim(10);
        bobby.swim(12);
        System.out.println("Total animals: " + Animal.getCountAnimal());
        System.out.println("Total cats: " + Cat.getCountCat());
        System.out.println("Total dogs: " + Dog.getCountDog());
    }
}
