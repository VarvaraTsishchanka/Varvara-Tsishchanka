package lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }
    public static void checkSumSign() {
int a;
int b;
int c;
a = 0;
b = -1;
c = a + b;
if (c >= 0) {
    System.out.println("Сумма положительная");
} if (c<0) {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        int value;
        value = 50;
        if (value <= 0) {
            System.out.println("Красный");
        } if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } if (value > 100) {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a;
        int b;
        a = 7;
        b = 9;
        if (a >= b) {
            System.out.println("a >= b");
        } if (a < b) {
            System.out.println("a < b");
        }
    }
}



