package t_leetcode;

public class L_34_FindFirstAndLastPositionOfElementInSortedArray {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            return new int[]{findLeft(nums,target),findRight(nums,target)};
        }
        // 找到 >= x 最左侧的位置
        public  int findLeft(int[] arr,int target) {
            int l = 0,r = arr.length - 1,m = 0,ans = -1;
            while(l <= r) {
                m = l + ((r - l) >> 1);
                if(arr[m] >= target) {
                    ans = m;
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            }
            if(ans < 0) {
                return -1;
            }
            return arr[ans] == target ? ans : -1;
        }
        // 找到 <= x 最右侧的位置
        public  int findRight(int[] arr,int target) {
            int l = 0,r = arr.length - 1,m = 0,ans = -1;
            while(l <= r) {
                m = l + ((r - l) >> 1);
                if(arr[m] <= target) {
                    ans = m;
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
            if(ans < 0) {
                return -1;
            }
            return arr[ans] == target ? ans : -1;
        }
    }
}