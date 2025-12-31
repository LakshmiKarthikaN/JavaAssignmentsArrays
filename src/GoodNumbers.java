public class GoodNumbers {
    public static void main(String[] args) {
        int n=50;
        long evenindices=(n+1)/2;
        long oddindices=n/2;
        long mul1=1;
        long mul2=1;
        for(long i=0;i<evenindices;i++){
            mul1=5*mul1;
        }for(long i=0;i<oddindices;i++){
            mul2=4*mul2;
        }System.out.println(mul1);
        System.out.println(mul2);
        System.out.println((int)mul1 * (int)mul2);

    }
}
