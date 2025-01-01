package lesson2;

public class HomeWork7Task5 {
    public static void main(String[] args) {
        swapArray();
    }
    public static void swapArray() {
        int[] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

