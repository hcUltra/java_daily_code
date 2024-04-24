package t_leetcode;

/**
 * @author hcUltra
 * @description TODO
 * @date 2024/4/24 21:21
 **/
public class L_268_MissingNumber {
    class Solution {
        public int missingNumber(int[] nums) {
            int eor = 0;
            for(int i = 0;i < nums.length;i++) {
                eor ^= i;
                eor ^= nums[i];
            }

            return eor ^ nums.length;
        }
    }
}
