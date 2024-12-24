package Lab2;

 public class Main {

     public static void main(String[] args) {
         Calculator calculator = new Calculator();
         System.out.println("Сумма: " + calculator.add(5, 10));
         System.out.println("Разность:" + calculator.subtract(20000000000000L ,10000000000000L));
         System.out.println("Умножение:" + calculator.multipl(10.5,20.7));
         System.out.println("Деление:" + calculator.divide(1000,0));

         // City
         City defCity = new City();
         City myCity = new City("Spb",5000000,1439,"Russia");
         System.out.println(defCity);
         System.out.println(myCity);


     }



 }






