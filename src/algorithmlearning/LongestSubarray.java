package algorithmlearning;

public class LongestSubarray {
    public static void main(String[] args) {
        int[] nums = {5,6,7,8};
        int k = 10;
        int l = 0;
        int r = 0;
        int sum = 0;
        int maxlen = 0;
        int maxsum = 0;
        while(r<nums.length){
            sum+=nums[r];
            if(sum>k){
                sum-=nums[l];
                l++;
            }
            r++;
            if(sum<=k) {
                maxsum = Math.max(maxsum, sum);
                maxlen = Math.max(maxlen, r - l + 1);
            }
        }
        System.out.println(maxlen);
        System.out.println(maxsum);
    }
}
