public class WayOfArrays {
    public static void main(String[] args) {
        int n=10;
        int x=2;
        int count=0;
        int sum=0;
        for(int i=1;i<=n/2;i++){

            for(int j=1;j<=x;j++){
                sum+=i*j;
                System.out.println(sum);
                if(sum==n){
                    count++;
                }
            }
        }System.out.println(count);
    }
}
