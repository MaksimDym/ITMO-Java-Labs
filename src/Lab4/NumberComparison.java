
// Ex1.4

package Lab4;

import java.util.Scanner;

public class NumberComparison {

    public static int[] readNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Введите число " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        return numbers;
    }

    public static boolean checkConditions(int[] numbers) {
        if (numbers.length < 3) {
            System.out.println("Недостаточно чисел для проверки условий.");
            return false;
        }
        return numbers[1] > numbers[0] && numbers[2] > numbers[1];
    }




}
