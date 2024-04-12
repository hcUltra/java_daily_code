package binary_search;

/**
 * @author hcUltra
 * @description 在有序数组中搜索目标值的索引
 * @date 2024/4/12 09:52
 **/
public class Day_20240412_FindNumberIndex {
    /**
     * 在升序数组中搜索目标值的索引
     *
     * @param arr    有序数组
     * @param target 目标值
     * @return 如果目标值存在，返回目标值的索引；如果目标值不存在，返回-1
     */
    public static int findNumberIndex(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid = 0;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (arr[mid] > target) {
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        // 搜索完毕后，没有找到目标值
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,5,7,9,12};
        System.out.println(findNumberIndex(arr,4));
        System.out.println(findNumberIndex(arr,5));
        System.out.println(findNumberIndex(arr,12));
    }
}
