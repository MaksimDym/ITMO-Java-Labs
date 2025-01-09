//Ex2.3

package Lab4;
import java.util.Arrays;
public class ArrayManipulator {
    private int[] array;

    public ArrayManipulator(int[] array) {
        this.array = array;
    }

    public void swapFirstAndLast() {
        if (array.length > 1) {
            int temp = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = temp;
        }
    }

    public void printArray() {
        System.out.println(Arrays.toString(array));
    }

}
