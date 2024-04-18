package t_leetcode;

/**
 * @author hcUltra
 * @description TODO
 * @date 2024/4/18 20:00
 **/
public class L_704_BinarySearch {
    class Solution {
        public int search(int[] nums, int target) {
            int left = 0, right = nums.length - 1, mid = 0;
            while (left <= right) {
                mid = left + ((right - left) >> 1);
                if (nums[mid] < target) {
                    left = mid + 1;
                } else if (nums[mid] > target) {
                    right = mid - 1;
                } else {
                    return mid;
                }
            }
            return -1;
        }
    }
}
