package lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
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
a = 3;
b = 5;
c = a + b;
if (c >= 0) {
    System.out.println("Сумма положительная");
} else if (c<0) {
            System.out.println("Сумма отрицательная");
        }
    }
}



