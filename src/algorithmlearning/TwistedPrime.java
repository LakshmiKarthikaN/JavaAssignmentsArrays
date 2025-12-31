package algorithmlearning;

public class TwistedPrime {
    static boolean isprime(int n){
        int c = 0;
        boolean prime = false;
        for(int i = 1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                c++;
                if(n/i!=i){
                    c++;
                }
            }
        }
        if(c==2){
            prime = true;
        }return prime;
    }
    static int reverse(int n){
        int rev = 0;
        while(n>0){
            int r = n%10;
            rev = rev *10 +r;
            n/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
      int n = 97;
        System.out.println(isprime(n) && isprime(reverse(n))?1:0);
    }
}
