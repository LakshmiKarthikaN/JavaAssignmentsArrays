package algorithmlearning;

public class KdiffPairs {
    public static int findPairs(int[] nums, int k) {
        int count =0;
        int left =0;
        int right =0;
        while(right<nums.length){
            int diff = Math.abs(nums[left]-nums[right]);
            if(diff == k && left!=right ){
                count++;
                left++;
            }
            right++;
        }return count;
    }
    public static void main(String[] args) {
        int[] nums = {3,1,4,1,5};
        int k = 2;
        System.out.println(findPairs(nums,k));
    }
}
