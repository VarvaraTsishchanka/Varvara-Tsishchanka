package lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
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
} else if (c<0) {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        int value;
        value = 105;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.printlm("Зеленый");
        }
    }
}



