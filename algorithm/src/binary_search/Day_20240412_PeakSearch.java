package binary_search;

/**
 * @author hcUltra
 * @description 峰值搜索
 * @date 2024/4/12 10:46
 **/
public class Day_20240412_PeakSearch {
    // 默认左边和右边都是无穷小
    // -MIN ... ... -MIN
    public static int peakSearch(int[] arr) {
        if (arr == null) {
            return -1;
        }

        if (arr.length == 1) {
            return 0;
        }

        if (arr[0] > arr[1]) {
            return 0;
        }

        if (arr[arr.length - 2] < arr[arr.length - 1]) {
            return arr.length - 1;
        }

        int left = 1;
        int right = arr.length - 2;
        int mid = 0;
        int ans = -1;
        while (left <= right) {
            mid = (left + right) >>> 1;
            if (arr[mid - 1] > arr[mid]) {
                right = mid - 1;
            } else if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                ans = mid;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,4,5,3,2,1};
        System.out.println(peakSearch(arr));
    }
}
