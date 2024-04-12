package binary_search;

/**
 * @author hcUltra
 * @description TODO
 * @date 2024/4/12 10:34
 **/
public class Day_20240412_LessNumberNearestPosition {
    /**
     * 搜索 < x 最右的位置
     * @param arr
     * @param target
     * @return
     */
    public static int lessNumberNearestPosition(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;
        int ans = -1;
        while (left <= right) {
            mid = (left + right) >>> 1;
            if (arr[mid] <= target) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 4, 4, 4, 5};
        System.out.println(arr.length);
        System.out.println(lessNumberNearestPosition(arr, 4));
    }
}
