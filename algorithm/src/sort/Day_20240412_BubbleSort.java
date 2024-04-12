package sort;

import java.util.Arrays;

/**
 * @author hcUltra
 * @description 冒泡排序
 * @date 2024/4/12 08:59
 **/
public class Day_20240412_BubbleSort {
    public static void bubbleSort(int[] arr) {
        // 边界条件，天然有序，无需继续进行，直接返回
        if (arr == null || arr.length < 2) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }



    public static void main(String[] args) {
        int[] arr = new int[]{9,8,7,6,5,4,3,2,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
