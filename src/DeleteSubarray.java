// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class DeleteSubarray{
        public static int maximumSum(int[] arr) {
            int currentsum =0;
            int count=0;
            int max = Integer.MIN_VALUE;
            for(int i =0;i<arr.length;i++){
                currentsum+=arr[i];
                max = Math.max(currentsum,max);
                if(currentsum < 0 && count==0){
                    currentsum -= arr[i];
                    count++;
                }if(currentsum<0 && count>0){
                    currentsum=0;
                }
            }
            return max;
        }
        public static int DeleteArray(int[] nums){
            int l = 0;
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();

        for (int r = 0; r < nums.length; r++) {
            while (set.contains(nums[r])) {
                set.remove(nums[l]);
                sum -= nums[l];
                l++;
            }
            System.out.println("Window: " + l + "-" + r + ", sum = " + sum + ", maxsum = " + maxsum);

            set.add(nums[r]);
            sum += nums[r];
            maxsum = Math.max(maxsum, sum);
            if(sum<0){
                sum=0;
            }
            System.out.println(set);
        }

        return maxsum;
        }
        public static int SubArray(int[] nums, int target){
            System.out.println("Try programiz.pro");

            int l=0;
            int r=0;
            int sum=0;
            int minsum=Integer.MAX_VALUE;
            while(r<nums.length){
                sum+=nums[r];
                if(sum>target){
                    sum-=nums[l];
                    l++;
                }
                System.out.println("Window: " + l + "-" + r + ", sum = " + sum + ", maxsum = " + minsum);
                for(int i = l;i<r;i++){
                    System.out.print(nums[i]);
                }
                if(sum==target){
                    minsum = Math.min(minsum,r-l+1);
                }
                r++;
            }
            return minsum;
        }
    public static int subarraysDivByK(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int sum = 0;
        int count = 0;
        while (r < nums.length) {
            sum += nums[r];
            if (sum % k == 0) {
                count++;
            }
            if (sum % k != 0) {

                sum -= nums[l];
                l++;
            }
            r++;
        }
        return count;
    }
   public static void main(String[] args) {
//        System.out.println("Try programiz.pro");
        //int[] nums = {-4,-1,-4};
       //int[] nums = {2,3,1,2,4,3};
      // int target = 7;
        //int[] arr = {1,-4,-5,-2,5,0,-1,2};
       // System.out.println(DeleteSubarray.maximumSum(arr));
     //  System.out.println(DeleteSubarray.DeleteArray(nums));
       //System.out.println(DeleteSubarray.SubArray(nums,target));
    int[] nums={4,5,0,-2,-3,1};
    int k =5;
       System.out.println(DeleteSubarray.subarraysDivByK(nums,k));


   }
}
