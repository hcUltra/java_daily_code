package training.day_20240416;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 注意此题要使用 BufferedReader 进行读取
 * 不然会超时
 */

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main_Fragment_Sum {
    public static void main(String[] args) throws IOException {
        Read in = new Read();
        int n = in.nextInt();
        int x = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int[] ans = f(arr, x);

        System.out.println(ans[0] + " " + ans[1]);
    }


    public static int[] f(int[] nums, int target) {
        int n = nums.length;
        int x = target;
        long[] arr = new long[n + 2];
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
                while (preSum[r] - preSum[l] >= x) {
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

    public static class Read {
        StringTokenizer st = new StringTokenizer("");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String next() throws IOException {
            while (!st.hasMoreTokens()) {
                st = new StringTokenizer(bf.readLine());
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }

}