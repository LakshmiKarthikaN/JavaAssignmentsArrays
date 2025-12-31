public class LongestSubarrayK {
    public static void main(String[] args) {
        int[] nums={2,5,1,10,10};
        int k = 14;
        int sum = 0;
       int maxlen =0;

        int left =0;
        int right =0;
        while(right < nums.length){
            sum +=nums[right];
            while(sum>k&&left<=right){

                sum -=nums[left];
                left =left+1;
            }

            maxlen = Math.max(maxlen,right-left+1);
            right =right+1;
        }
        System.out.println(maxlen);
    }
}
