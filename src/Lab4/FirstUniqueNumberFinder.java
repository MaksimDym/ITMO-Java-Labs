// Ex2.4


package Lab4;

public class FirstUniqueNumberFinder {
    public Integer findFirstUnique(int[] array) {
        int[] count = new int[101];

        for (int num : array) {
            count[num]++;
        }

        for (int num : array) {
            if (count[num] == 1) {
                return num;
            }
        }

        return null;
    }




}

