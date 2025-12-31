public class ClimpStairs {

        public static int climbStairsdp(int n) {
            // Edge cases
            if (n == 0 || n == 1) return 1;

            int[] dp = new int[n + 1]; // dp[i] means number of ways to reach step i
            dp[0] = 1; // 1 way to stay on the ground
            dp[1] = 1; // 1 way to reach step 1

            // Fill the dp array
            for (int i = 2; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
                System.out.println(dp[i]);
            }

            return dp[n];
        }

        public static void main(String[] args) {
            int n = 5;
            System.out.println("Number of ways to climb " + n + " stairs: " + climbStairsdp(n));
        }
    }


