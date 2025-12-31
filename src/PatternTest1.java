import static java.lang.Math.sqrt;

public class PatternTest1 {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;
        for(int i = 0;i<n;i++){
            if(i%2==0){
                for(int j = 0;j<=i;j++){
                    System.out.print(num+" ");
                    num++;
                }
            }else{
                int start = num+i;
                 num=start+1;
                 for(int j = start;j>=num-(i+1);j--){
                     System.out.print(j+" ");
                 }
            }
            System.out.println();
        }

        for(int i = 0;i<n;i++){
            num = i+1;
            for(int j = 0;j<=i;j++){
                System.out.print(num+" ");
                num=num+n-1;
            }
            System.out.println();
        }
        int n1 = 36;
        int count = 0;
        for(int i = 1;i<=n1;i++){
            if(n1%i==0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
        int n2 = 36;
        int c = 0;
        for(int i = 1;i*i<=n2;i++){
            if(n2%i==0){
                System.out.println(i);
                if((n2/i)!=i){
                    System.out.println(n2/i);
                }
            }
        }
        int n3 = 11;
        int c1 = 0;
        for(int i = 1;i*i<=n3;i++){
            if(n3%i==0){
                c1++;
                if((n3/i)!=i){
                    c1++;
                }
            }
        }if(c1==2){
            System.out.println("Prime");
        }
    }
}
