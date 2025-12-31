package algorithmlearning;

public class GCD {
    public static void divisorNumber(int n){
        for(int i = 1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
        for(int i = 1;i*i<=n;i++){
            if(n%i==0){
                System.out.println(i);
                if((n/i)!=i){
                    System.out.println(n/i);
                }
            }
        }
    }
    public static void primeNumber(int n){
        int c = 0;
        for(int i = 1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c==2){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
        int c1 = 0;
        for(int i = 1;i*i<=n;i++){
            if(n%i==0){
                 c1++;
                if((n/i)!=i){
                    c1++;
                }
            }
        }if(c1==2){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }

    }
    public static void primeFactor(int n){
        int c=0;
        for(int i = 1;i*i<=n;i++){
            if(n%i==0){
                c++;
                if((n/i)!=i){
                    c++;
                }
            }
            if(c==2){
                System.out.println("prime factor"+i);
            }
        }
    }
    public static void main(String[] args) {
        divisorNumber(36);
        primeNumber(41);
        primeFactor(60);
        int n1 = 9;
        int n2 = 12;
        int gcd = 1;
        for(int i = 1;i<=Math.min(n1,n2);i++){
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
        }
        System.out.println(gcd);
        for(int i =Math.min(n1,n2);i>=1;i--){
            if(n1%i==0 && n2%i==0){
                System.out.println(i);
                break;
            }
        }
        System.out.println(n1);
        System.out.println(n2);
        while(n1>0 && n2>0){
            if(n1>n2){
                n1 = n1%n2;
            }
            else{
                n2 = n2%n1;
            }
        }
        if(n1==0){
            System.out.println(n2);
        }else{
            System.out.println(n1);
        }

     }

}
