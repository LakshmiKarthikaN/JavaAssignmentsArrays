public class NumberOfSteps {
    public static void main(String[] args) {
        int num=14;
        int count=0;
        while(num!=0){
            num/=2;

            if(num%2==1){
                num=num-1;
            }
            num=num;

            count++;

        }System.out.println(count);
    }
}
