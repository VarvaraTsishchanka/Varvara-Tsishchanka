package lesson6;

public class Main {

    public static void main(String[] args) {

        String[][] array = {
                {"0", "5", "10", "15"},
                {"20", "25", "30", "40"},
                {"45", "50", "55", "60"},
                {"65", "70", "75", "80"}
        };
        try {

            int sum = ArrayProcessor.sum2DArray(array);

            System.out.println("Sum of the array: " + sum);

        } catch (MyArraySizeException e) {

            System.out.println("Array size exception: " + e.getMessage());

        } catch (MyArrayDataException e) {

            System.out.println("Data exception at position (" + e.getRow() + "," + e.getCol() + "): " + e.getMessage());

        }

    }

}


