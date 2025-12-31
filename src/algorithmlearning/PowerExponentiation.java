package algorithmlearning;

public class PowerExponentiation {
    public static void main(String[] args) {
        int x = 2;
        int n = 21;
        int ans = 1;
        while(n>0){
            if(n%2==1){
                ans = ans * x;
                n= n-1;
            }else{
                x = x*x;
                n = n/2;
            }
        }
        System.out.println(ans);
    }
}
