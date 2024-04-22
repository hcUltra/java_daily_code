package t_leetcode;

/**
 * @author hcUltra
 * @description TODO
 * @date 2024/4/21 12:27
 **/
public class L_70_ClimbingStairs {
    class Solution {
        public int climbStairs(int n) {
            int[] dp = new int[n + 1];
            if(n <= 2) {
                return n;
            }
            dp[0] = 0;
            dp[1] = 1;
            dp[2] = 2;

            for(int i = 3;i < dp.length;i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
            return dp[n];
        }

    }
}
