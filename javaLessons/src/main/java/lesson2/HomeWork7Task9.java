package lesson2;

public class HomeWork7Task9 {
    public static void main(String[] args) {
        newArray(5, 3);
    }
    public static void newArray(int len, int initialValue) {
        len = 5;
        initialValue = 3;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print (arr[i] + " ");
        }
    }
}

