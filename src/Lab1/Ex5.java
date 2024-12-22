package Lab1;

import java.util.Scanner;


class Ex5 {
    public void readAndPrintInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        String input = scanner.nextLine();
        System.out.println(input);
        scanner.close();
    }
}
