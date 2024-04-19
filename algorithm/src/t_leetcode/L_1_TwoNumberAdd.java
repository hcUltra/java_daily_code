package t_leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hcUltra
 * @description TODO
 * @date 2024/4/19 20:30
 **/
public class L_1_TwoNumberAdd {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int key = target - nums[i];
                if (map.containsKey(key)) {
                    return new int[]{map.get(key), i};
                } else {
                    map.put(nums[i], i);
                }
            }
            return new int[]{-1, -1};
        }
    }
}
