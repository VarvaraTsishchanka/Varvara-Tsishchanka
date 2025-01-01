package lesson2;

public class HomeWork7Task1 {
    public static void main(String[] args) {
        System.out.println(isSumCorrect(7, 6));
    }
    static boolean isSumCorrect(int a, int b) {
        a = 7;
        b = 6;
        return (a+b) >= 10 && (a+b) <= 20;
    }
}




