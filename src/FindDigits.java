public class FindDigits {
    public static void main(String[] args) {
        int n=123456789;
        int count = 0;
        int temp=n;
        while(temp>0){
            int r = temp%10;
            if(r==0){
                temp/=10;
                continue;
            }
            if(n%r==0){
                count++;
            }
            temp/=10;

        }
        System.out.println(count);
    }
}
