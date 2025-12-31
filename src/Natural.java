public class Natural {

    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
//        Main.printNUm(1,5);
//        Main.printNumbers(5,1);
        //System.out.println(Main.NaturalNumber(5));
    }
    public static int NaturalNumber(int n){
        int sum = 0;
        if(n==1){
            return 1;
        }
        return sum+NaturalNumber(n-1);
    }
}

