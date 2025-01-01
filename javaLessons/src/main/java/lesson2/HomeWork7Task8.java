package lesson2;

public class HomeWork7Task8 {
    public static void main(String[] args) {
        fillDiagonal();
    }
    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i <4; i++) {
            arr[i][i] = 1;
            arr[i][4 - i - 1] = 1;
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
