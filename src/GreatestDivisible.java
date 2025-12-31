public class GreatestDivisible {
    public static void main(String[] args) {
        int max = 0;

        int[] nums={3,6,5,1,8};
        int n = nums.length;
        int[] dp = {0,Integer.MIN_VALUE,Integer.MIN_VALUE};
        for(int num : nums){
            int[] temp = dp.clone();
            for(int i = 0;i<3;i++){
                if(temp[i]!=Integer.MIN_VALUE){
                    int sum = temp[i]+num;
                    dp[sum%3]=Math.max(dp[sum%3],sum);
                    System.out.println(dp[i]);
                    System.out.println(temp[i]);

                }
            }
        }
        System.out.println(dp[0]);
    }
}
