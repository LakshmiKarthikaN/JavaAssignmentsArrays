public class ReversePairs {
    public static void main(String[] args) {
        int[] nums={2147483647,2147483647,-2147483647,-2147483647,-2147483647,2147483647};
        int count=0;
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                long temp =2L*nums[j];
                if(temp==Integer.MIN_VALUE || temp ==Integer.MAX_VALUE){
                    System.out.println(0);
                }
                else {
                    if (nums[i] > temp) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
