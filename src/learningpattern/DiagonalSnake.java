package learningpattern;

public class DiagonalSnake {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0;i<n;i++){
            for(int j =0;j<n;j++){
                int d = i+j;
                int start;
                if(d<n){
                    start = (d*(d+1))/2+1;

                }
                else{
                    int before = n*(n+1)/2;
                    int extra = d-(n-1);
                    start = before
                            + extra * n
                            - (extra * (extra - 1)) / 2
                            - (n - 1);

                }
                int value = start + d-i;
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }
}
