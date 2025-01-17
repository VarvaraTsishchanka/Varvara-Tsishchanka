package lesson6;

public class ArrayProcessor {

    public static int sum2DArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {

        if (arr.length != 4 || arr[0].length != 4) {

            throw new MyArraySizeException("Array size must be 4x4");

        }


        int sum = 0;

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                try {

                    sum += Integer.parseInt(arr[i][j]);

                } catch (NumberFormatException e) {

                    throw new MyArrayDataException("Invalid data at position (" + i + "," + j + ")", i, j);

                }

            }

        }


        return sum;

    }

}
