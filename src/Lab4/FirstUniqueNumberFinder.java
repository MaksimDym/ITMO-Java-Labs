// Ex2.4


package Lab4;

public class FirstUniqueNumberFinder {
    private int[] array;

    public FirstUniqueNumberFinder(int[] array) {
        this.array = array;
    }

    public Integer findFirstUnique() {
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

