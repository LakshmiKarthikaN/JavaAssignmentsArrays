public class Main1 {
          //recursion practice
            public static void printReverse(int n){
                if(n > 5){
                    return; // base case
                } System.out.println(n);
                printReverse(n + 1); // recursive call first

            }
    public static void print(int n){
        if(n > 5){
            return;
        }
        print(n + 1); // recursive call first
        System.out.println(n);
    }
            public static int sumOfNnumbers(int n){
                if(n==5){
                    return 5;
                }return n+sumOfNnumbers(n+1);
            }public static int fact(int n){
                if(n==1){
                    return 1;
                }return n*fact(n-1);
         }
         public static int fib(int n){
                if(n==0){
                    return 0;
                }if(n==1){
                    return 1;
             }
                return fib(n-1)+fib(n-2);
         }

         public static void main(String[] args) {
            System.out.println("Try programiz.pro");
            Main1.printReverse(1);
            System.out.println(sumOfNnumbers(1));
            System.out.println(fact(5));
            Main1.print(1);
             System.out.println(Main1.fib(5));
        }

}
