package training.day_20240416;

import java.util.Arrays;

/**
 * @author hcUltra
 * @description TODO
 * @date 2024/4/16 21:06
 **/
public class Validator {
    public static int[] test(int[] arr, int target) {
        int n = arr.length;
        int x = target;
        int[] g = new int[n + 2];
        long sum = 0;
        int l = 0;
        int r = 0;
        int j = 1;
        int max = n + 5;
        for (int i = 1; i <= n; i++) {
            g[i] = arr[i - 1];
            sum += g[i];
            if (sum >= x) {
                while (sum >= x) {
                    if (i - j + 1 < max) {
                        max = i - j + 1;
                        l = j;
                        r = i;
                    }
                    sum -= g[j++];
                }
            }
        }

        return new int[]{l, r};
    }

    public static int[] f(int[] nums, int target) {
        long n = nums.length;
        int x = target;
        long[] arr = new long[(int) (n + 2)];
        for (int i = 1; i <= n; i++) {
            arr[i] = nums[i - 1];
        }
        long[] preSum = calcPreSum(arr);
        int al = 0;
        int ar = 0;
        int alen = Integer.MAX_VALUE;
        for (int l = 1, r = 1; r <= n; r++) {
            if (preSum[r] - preSum[l - 1] >= x) {
                // slid window
                while (l <= n && preSum[r] - preSum[l] >= x) {
                    l++;
                }
                if ((r - l + 1) < alen) {
                    al = l;
                    ar = r;
                    alen = r - l + 1;
                }
            }
        }
        return new int[]{al, ar};
    }

    public static long[] calcPreSum(long[] arr) {
        long[] ret = new long[arr.length];
        ret[0] = 0;
        for (int i = 1; i < arr.length; i++) {
            ret[i] = ret[i - 1] + arr[i];
        }
        return ret;
    }


    public static void main(String[] args) {
//        int[] arr = new int[]{7, 3, 5, 10, 9, 2, 11};
//        System.out.println(Arrays.toString(f(arr,14)));

        int[] arr = new int[]{1, 1, 6, 10, 9, 3, 3, 5, 3, 7};
        int target = 20;
        System.out.println(Arrays.toString(test(arr, target)));
        System.out.println(Arrays.toString(f(arr, target)));

        int testCount = 1_000;
        int maxLength = 100000;
        int maxValue = 10000;
        int targetMaxValue = 200000;
        for (int i = 0; i < testCount; i++) {
            int len = (int) (Math.random() * maxLength + 1);
            int[] nums = new int[len];
            for (int j = 0; j < len; j++) {
                nums[j] = (int) (Math.random() * maxValue + 2);
            }

            int t = (int) (Math.random() * targetMaxValue + 2);
            int[] ans1 = test(nums, t);
            int[] ans2 = f(nums, t);
            if (ans1[0] != ans2[0] || ans1[1] != ans2[1]) {
                System.out.println("测试失败！");
                System.out.println("nums:" + Arrays.toString(nums));
                System.out.println(t);
                System.out.println("ans1:" + Arrays.toString(ans1));
                System.out.println("ans2:" + Arrays.toString(ans2));
                return;
            } else {
                System.out.println("nums:" + Arrays.toString(nums));
                System.out.println(t);
                System.out.println("ans1:" + Arrays.toString(ans1));
                System.out.println("ans2:" + Arrays.toString(ans2));
            }

            System.out.println("测试成功！");
        }
    }
}

