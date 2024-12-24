package Lab2;

public class Calculator {
        // ///////////////////////////////
        public int add(int a , int b) {
            return a + b ;

        }

        public long add(long a , long b){
            return a+b ;
        }

        public double add (double a , double b){
            return a+b ;
        }
         // ////////////////////////////////////
        public int subtract (int a , int b ){
            return a-b ;
        }

        public long subtract (long a , long b ){
        return a-b ;
        }

        public double subtract (double a , double b ){
        return a-b ;
        }

        // //////////////////////////////////////////////

         public int multipl (int a , int b) {
            return a*b ;
         }

          public long multipl (long a , long b) {
          return a*b ;
         }

         public double multipl (double a , double b) {
            return a*b ;
        }

        // ////////////////////////////////////////////////

        public int divide(int a, int b) {
            if (b == 0) {
                System.out.println("Деление на ноль невозможно");
                return 0;
            } else {
                return a / b;
            }
        }

            public long divide(long a, long b){
                if (b == 0) {
                    System.out.println("Деление на ноль невозможно");
                    return 0;
                } else {
                    return a / b;
                }
            }

                public double divide(double a, double b){
                if (b == 0) {
                    System.out.println("Деление на ноль невозможно");
                    return 0;
                } else {
                    return a / b;
                }
            }


              }