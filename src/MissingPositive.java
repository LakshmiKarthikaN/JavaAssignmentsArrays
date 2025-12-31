public class MissingPositive {
    public static void main(String[] args) {
        int[] nums={1,2,0};
        int sum=0;
        int n=nums.length*(nums.length+1)/2;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=1){
                System.out.println(1);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                sum+=nums[i];
            }
        }
        System.out.println(n-sum);
    }
}
