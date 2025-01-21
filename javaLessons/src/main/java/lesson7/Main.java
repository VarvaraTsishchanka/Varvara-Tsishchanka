package lesson7;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AppData appData = new AppData();
        appData.setHeader(new String[]{"Value 1", "Value 2", "Value 3"});
        appData.setData(new int[][]{
                {100, 200, 123},
                {300, 400, 500}});
        try {
            appData.save("data.csv");
            appData.load("data.csv");
            System.out.println("Header: " + String.join(", ", appData.getHeader()));
            for (int[] row : appData.getData()) {
                System.out.println("Row: " + Arrays.toString(row));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

