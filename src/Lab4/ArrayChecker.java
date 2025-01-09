
// Ex1.5 + Ex1.6

package Lab4;

public class ArrayChecker {

    public boolean checkFirstOrLast(int[] array) {

        if (array.length < 2) {
            return false;
        }

        return array[0] == 3 || array[array.length - 1] == 3;
    }

    public boolean containsOneOrThree(int[] array) {
        for (int num : array) {
            if (num == 1 || num == 3) {
                return true;
            }
        }
        return false;
    }

}

