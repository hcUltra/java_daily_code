package t_leetcode;

import java.util.Arrays;

/**
 * @author hcUltra
 * @description TODO
 * @date 2024/4/20 18:16
 **/
public class L_4_MedianOfTwoSortedArrays {

    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int[] arr = new int[nums1.length + nums2.length];
            int k = 0;

            for (int i = 0; i < nums1.length; i++) {
                arr[k++] = nums1[i];
            }

            for (int i = 0; i < nums2.length; i++) {
                arr[k++] = nums2[i];
            }
            Arrays.sort(arr);
            if ((arr.length) % 2 == 0) {
                return (arr[arr.length >> 1] + arr[(arr.length >> 1) - 1]) / 2.0;
            } else {
                return arr[arr.length >> 1];
            }
        }
    }
}
