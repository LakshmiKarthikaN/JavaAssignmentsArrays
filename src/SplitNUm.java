import java.util.Arrays;
public class SplitNUm {
    public static void main(String[] args) {
        int num=4325;
        int[] digits = new int[10];
        int len = 0;

        while (num > 0) {
            digits[len++] = num % 10;
            num /= 10;
        }

        Arrays.sort(digits, 0, len);
        int num1=0,num2=0;
        for(int i=0;i<len;i++){
            if(i%2==0){
                num1=num1*10+digits[i];
            }
            else{
                num2=num2*10+digits[i];
            }
        }

        System.out.println(num1+num2);
    }
}
