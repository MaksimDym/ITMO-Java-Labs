package Lab4;
import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       // Ex1.1

       // OddNumberPrinter printer = new OddNumberPrinter();
       // printer.printOddNumbers();

       // Ex1.2

       // DivisibleNumbers.printDivisibleBy3();
       // DivisibleNumbers.printDivisibleBy5();
       // DivisibleNumbers.printDivisibleByBoth();

       // Ex1.3

       //SumChecker sumChecker = new SumChecker();
       //int[] numbers = sumChecker.readNumbers();
       //int sum = sumChecker.calculateSum(numbers[0], numbers[1]);
       //boolean result = sumChecker.checkSumEqualsThird(sum, numbers[2]);
       //System.out.println("Результат: " + result);

       // Ex1.4

       int[] numbers = NumberComparison.readNumbers();


       if (NumberComparison.checkConditions(numbers)) {
           System.out.println("Условия выполнены: второе число больше первого, а третье больше второго.");
       } else {
           System.out.println("Условия не выполнены.");

           // Ex1.5 + Ex1.6

       /* ArrayChecker arrayChecker = new ArrayChecker();

        int[] array = {2, -3, 7, 4, 5, 4, 3};
        int[] array2 = {3,5,7,-2,1,3};
        boolean result = arrayChecker.checkFirstOrLast(array);

        System.out.println("array = " + java.util.Arrays.toString(array));
        System.out.println( "Появляется ли число 3 как первый или последний элемент массива? - "+ result);

        boolean result2 = arrayChecker.containsOneOrThree(array2);
        System.out.println();
        System.out.println("array2 = " + java.util.Arrays.toString(array2));
        System.out.println("Массив содержит число 1 или 3 ?  - " + result2); */

           //Ex2.1

       /* int[] array = {1, 2, 3, 4, 5};
        if (ArrayUtils.isSorted(array)){
          System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }

        */

           // Ex2.2

       /* Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int length = scanner.nextInt();

        int[] inputArray = new int[length];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < length; i++) {
            inputArray[i] = scanner.nextInt();
        }

        ArrayHandler handler = new ArrayHandler();
        handler.initializeArray(inputArray);

        handler.printArray(); /*


       //Ex2.3

      // int[] myArray = {1, 2, 3, 4, 5};
       // ArrayManipulator manipulator = new ArrayManipulator(myArray);

       // System.out.println("Исходный массив:");
       // manipulator.printArray();


       // manipulator.swapFirstAndLast(myArray);

       // System.out.println("Массив после обмена первого и последнего элемента:");
       // manipulator.printArray();


       //Ex2.4

      /* FirstUniqueNumberFinder finder = new FirstUniqueNumberFinder();
       int[] array = {2, 3, 5, 3, 2};
       Integer uniqueNumber = finder.findFirstUnique(array);

       if (uniqueNumber != null) {
           System.out.println("Первое уникальное число: " + uniqueNumber);
       } else {
           System.out.println("Уникальных чисел нет.");
       }
       */
       }
   }
}






