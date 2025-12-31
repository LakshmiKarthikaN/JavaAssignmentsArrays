package algorithmlearning;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        int l = 0;
        int r = 0;
        int zeros = 0;
        int maxlen = 0;
        while(r<nums.length){
            if(nums[r]==0){
                zeros++;
            }
            while(zeros>k){
                if(nums[l]==0){
                   zeros--;

                }l++;
            }
               if(zeros<=k) {
                   maxlen = Math.max(maxlen, r - l + 1);
               }
            r++;
        }
        System.out.println(maxlen);
    }
}
