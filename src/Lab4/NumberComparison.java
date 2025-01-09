
// Ex1.4

package Lab4;

import java.util.Scanner;

public class NumberComparison {

    public static int[] readNumbers() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];

        System.out.print("Введите первое число: ");
        numbers[0] = scanner.nextInt();

        System.out.print("Введите второе число: ");
        numbers[1] = scanner.nextInt();

        System.out.print("Введите третье число: ");
        numbers[2] = scanner.nextInt();

        return numbers;
    }

    public static boolean checkConditions(int firstNumber, int secondNumber, int thirdNumber) {
        return secondNumber > firstNumber && thirdNumber > secondNumber;
    }




}
