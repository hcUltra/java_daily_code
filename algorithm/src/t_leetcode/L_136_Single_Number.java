package t_leetcode;

/**
 * @author hcUltra
 * @description TODO
 * @date 2024/4/21 12:29
 **/
public class L_136_Single_Number {
    class Solution {
        public int singleNumber(int[] nums) {
            int ans = 0;
            for (int x : nums) {
                ans ^= x;
            }

            return ans;
        }
    }
}
