package lesson2;

public class HomeWork7Task1 {
    public static void main(String[] args) {
        isSumCorrect();
    }
    public static boolean isSumCorrect (int a, int b, int c) {
        a = 5;
        b = 3;
        c = a + b;
        if (c >= 10 && c <= 20) {
            return true;
        } else {
            return false;
        }
    }
}


