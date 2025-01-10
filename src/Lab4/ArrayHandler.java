//Ex2.2

package Lab4;

import java.util.Scanner;

public class ArrayHandler {
    private int[] array;

    public void initializeArray(int[] inputArray) {
        array = new int[inputArray.length];
        System.arraycopy(inputArray, 0, array, 0, inputArray.length);
    }

    public int[] getArray() {
        return array;
    }

    public void printArray() {
        System.out.print("Result: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }




}
