package lesson2;

public class HomeWork7Task4Extra {
    public static void main(String[] args) {
        System.out.println(isItLeapYear());
    }
    public static boolean isItLeapYear() {
        int year = 2020;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}


