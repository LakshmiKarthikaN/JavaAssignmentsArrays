package algorithmlearning;

public class MaximumCards {
    public static void main(String[] args) {
        int[] nums= {6,2,3,4,7,2,1,7,1};
        int k = 4;
        int lsum =0;
        int rsum = 0;
        for(int i = 0;i<k;i++){
            lsum+=nums[i];
        }
        int maxsum = lsum;
        int index = nums.length-1;
        for(int i =k-1;i>=0;i--){
            lsum = lsum - nums[i];
            rsum = rsum + nums[index];
            index--;
            maxsum = Math.max(maxsum,lsum+rsum);
        }
        System.out.println(maxsum);

    }
}
