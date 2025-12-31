package algorithmlearning;

public class ConstantWindow {
    public static void main(String[] args) {

        int[] arr = {1,2,1,4,5,1};
        int k = 3;
        int l = 0;
        int r = k;
        int sum = 0;
        for(int i = 0;i<r;i++){
            sum+=arr[i];
        }System.out.println(r);
        int maxsum = sum;
        while(r<arr.length){
            sum = sum+arr[r];
            r++;
            sum = sum - arr[l];
            l++;
            maxsum = Math.max(sum,maxsum);
        }System.out.println(sum);
    }
}
