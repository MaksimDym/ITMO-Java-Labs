//Ex2.3

package Lab4;
import java.util.Arrays;
public class ArrayManipulator {
    private int[] array;

    public ArrayManipulator(int[] array) {
        this.array = array;
    }

    public void swapFirstAndLast(int[] newArray) {
        if (newArray.length > 1) {
            int temp = newArray[0];
            newArray[0] = newArray[newArray.length - 1];
            newArray[newArray.length - 1] = temp;
        }
    }

    public void printArray() {
        System.out.println(Arrays.toString(array));
    }


}
