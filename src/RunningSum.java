public class RunningSum {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int[] num=new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum=0;
            for (int j = 0; j <= i; j++) {
                sum += nums[j];
            }
            num[i] = sum;
            System.out.println(num[i]);
        }
//        int[] nums={3,1,2,10,1};
//        for(int i=1;i<nums.length;i++){
//            nums[i]=nums[i]+nums[i-1];
//
//        }for(int i=0;i<nums.length;i++){
//            System.out.println(nums[i]);
//        }

    }
}
