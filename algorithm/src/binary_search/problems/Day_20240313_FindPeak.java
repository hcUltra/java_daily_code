package binary_search.problems;

/**
 * @author hcUltra
 * @description TODO
 * @date 2024/4/14 19:17
 **/
public class Day_20240313_FindPeak {
    class Solution {
        public int findPeakElement(int[] nums) {
            if (nums.length == 1) {
                return 0;
            }

            if (nums[0] > nums[1]) {
                return 0;
            }

            if (nums[nums.length - 2] < nums[nums.length - 1]) {
                return nums.length - 1;
            }

            int left = 1, right = nums.length - 2, mid = 0;
            while (left <= right) {
                mid = left + ((right - left) >> 1);
                if (nums[mid - 1] > nums[mid]) {
                    right = mid - 1;
                } else if (nums[mid] < nums[mid + 1]) {
                    left = mid + 1;
                } else {
                    return mid;
                }
            }
            return -1;
        }
    }

}
