package lesson5;

public class FruitsMain {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        Box<Apple> box1 = new Box<>(apple1, apple2, apple3);
        Box<Orange> box2 = new Box<>(orange1, orange2, orange3);

        System.out.println(box1.compare(box2));

        Box<Orange> box3 = new Box<>();
        box2.transfer(box3);
    }
}


