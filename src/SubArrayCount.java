public class SubArrayCount {
    public static void main(String[] args) {
        int[] nums ={-1,-1,1};
        int k = 0;
//        int l =0;
//        int r=0;
//        int mul =1;
//        int count =0;
//
//        while(r<nums.length) {
//            mul *= nums[r];
//            if (mul >= k && l<=r) {
//                mul /= nums[l];
//                l++;
//            }
//            count += r - l + 1;
//            r++;
//        }
        int l=0;
        int r=0;
        int sum=0;
        int count=0;
        while(r<nums.length){
            sum+=nums[r];
            while(sum>k){
                sum-=nums[l];
                l++;
            }
                if(sum==k) {
                    count++;
                }

            r++;
        }
        System.out.println(count);
    }
}
