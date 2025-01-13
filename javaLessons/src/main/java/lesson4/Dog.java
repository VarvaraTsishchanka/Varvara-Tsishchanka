package lesson4;

public class Dog extends Animal {
    String name;
    static int countDog = 0;

    Dog(String name) {
        super();
        countDog++;
        this.name = name;
    }

    @Override
    void run(int range) {
        if (range > 500) {
            System.out.println(name + " cannot run more than 500 m");
        } else {
            System.out.println(name + " ran " + range + " m");
        }

    }

    @Override
    void swim(int range) {
        if (range > 10) {
            System.out.println("Dog cannot swim more than 10 m");
        } else {
            System.out.println(name + " swam " + range + " m");
        }
    }

    static int getCountDog() {
        return countDog;
    }
}
