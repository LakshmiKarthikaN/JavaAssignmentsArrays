public class SortArrayByParity {
    public static void main(String[] args) {
        int[] nums={3,1,2,4};
        int evencount=0;
        int oddcount=nums.length-1;
        int[] num=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                num[evencount++]=nums[i];

            }else{
                num[oddcount--]=nums[i];
            }
        }for(int i=0;i<num.length;i++) {
            System.out.println(num[i]);
        }
    }
}
