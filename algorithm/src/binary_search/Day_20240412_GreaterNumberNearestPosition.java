package binary_search;

import java.util.Arrays;

/**
 * @author hcUltra
 * @description
 * @date 2024/4/12 10:07
 **/
public class Day_20240412_GreaterNumberNearestPosition {
    /**
     * 搜索 >= x 且距离x最近的（最左的）位置
     *
     * @param arr    升序数组
     * @param target 目标值
     * @return 返回大于等于x最左的位置
     */
    public static int greaterNumberNearestPosition(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;
        int ans = -1;
        while (left <= right) {
            mid = (left + right) >>> 1;
            if (arr[mid] >= target) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 4, 4, 4, 5};
        System.out.println(arr.length);
        System.out.println(greaterNumberNearestPosition(arr, 4));
    }
}
