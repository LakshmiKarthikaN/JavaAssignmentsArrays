public class DiamondPattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n*2-1;i++){
            int spaces=i<=5?n-i:i-n;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }int stars=i<=5?i:n*2-i;
            for(int j=1;j<=stars;j++){
                System.out.print("* ");
            }System.out.println();
        }
    }
}
