package lesson2;

public class HomeWork7Task6 {
    public static void main(String[] args) {
        fillArray(100);
    }
    public static void fillArray(int size) {
        int[] fillArr = new int[100];
        for (int i = 0; i < fillArr.length; i++) {
            fillArr[i] = i + 1;
            System.out.print(fillArr[i] + " ");
        }
    }
}

