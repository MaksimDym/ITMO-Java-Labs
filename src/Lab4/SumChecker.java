
// Ex1.3

package Lab4;

import java.util.Scanner;

public class SumChecker {
    public int[] readNumbers() {
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

    public int calculateSum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public boolean checkSumEqualsThird(int sum, int thirdNumber) {
        return sum == thirdNumber;
    }


}
