package learningpattern;

public class PatternPrint3 {
    public static void main(String[] args) {
        int n = 5;
        int num=1;
        for(int i = 0;i<n;i++){
            if(i%2==0){
                for(int j = 0;j<=i;j++){
                    System.out.print(num+" ");
                    num++;
                }
            }else{
               int start = num+i;
               num = start +1;
               for(int j = start;j>=num-(i+1);j--){
                   System.out.print(j+" ");
               }
            }
            System.out.println();
        }
        int num2 = 1;
        for(int i = 0;i<2*n-1;i++){
            int level = (i<n)?n-i-1:i-n+1;
            for(int s = 0;s<level;s++){
                System.out.print(" ");
            }
            for(int j = 0;j<2*(n-level)-1;j++){
                System.out.print(num2+" ");
                num2++;
            }
            System.out.println();
        }
        int num3 = 1;
        for(int i = 0;i<n;i++){
            for(int s = 0;s<i;s++){
                System.out.print(" ");
            }
            for(int j = 0;j<n-i;j++){
                System.out.print(num3+" ");
                num3++;
            }
            System.out.println();
        }
        int num4 = 1;
        for(int i = 0;i<=n;i++){
            for(int s = 0;s<i;s++){
                System.out.print(" ");
            }
            if(i%2==0){
                for(int j = 0;j<n*2-((i*2)+1);j++){
                    System.out.print(num4+" ");
                    num4++;
                }
            }else{
                int start = 2*n+(num4-i)+1;
                 num4 = start+1;
                 for(int j = start;j>=num4-(i+n);j--){
                     System.out.print(j+" ");
                 }
            }
            System.out.println();
        }
    }
}
