package binary_search.problems;

/**
 * @author hcUltra
 * @description TODO
 * @date 2024/4/13 19:59
 **/
public class Day_20240413_SearchInsert {
    static class Solution {
        public  int searchInsert(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            int mid = 0;
            int ans = -1;
            while (left <= right) {
                mid = left + ((right - left) >>> 1);
                if (nums[mid] <= target) {
                    ans = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return ans == -1 ? 0 : nums[ans] == target ? ans : ans + 1;
        }
    }

}
