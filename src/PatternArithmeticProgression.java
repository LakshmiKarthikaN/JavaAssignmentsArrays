public class PatternArithmeticProgression {
    public static void main(String[] args) {
        int n=3;
        for(int i=1;i<=n;i++){
            int num=i;
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num+=n;
            }
            System.out.println();
        }
    }
}
