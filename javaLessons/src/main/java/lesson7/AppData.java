package lesson7;

import java.io.*;
import java.util.Arrays;

public class AppData {
    private String[] header;
    private int[][] data;

    public String[] getHeader() {
        return header;
    }

    public int[][] getData() {
        return data;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    public void save(String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(String.join(";", header));
            writer.newLine();
            for (int[] row : data) {
                String rowData = Arrays.stream(row)
                        .mapToObj(String::valueOf)
                        .reduce((a, b) -> a + ";" + b)
                        .orElse("");
                writer.write(rowData);
                writer.newLine();
            }
        }
    }

    public void load(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            header = reader.readLine().split(";");
            data = reader.lines()
                    .map(line -> Arrays.stream(line.split(";"))
                            .mapToInt(Integer::parseInt)
                            .toArray())
                    .toArray(int[][]::new);
        }
    }
}



