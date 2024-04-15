package training.day_20240415;

import java.util.Arrays;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息

/**
 * 牛客：爬楼梯的最小花费
 */
public class Main_Min_Cost {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 1. 读取数据
        int length = in.nextInt();
        if (length <= 2) {
            System.out.println(0);
            return;
        }

        int[] cost = new int[length];
        for (int i = 0; i < length; i++) {
            cost[i] = in.nextInt();
        }
        int[] dp = new int[length + 1];
        dp[0] = dp[1] = 0;
        for (int i = 2; i < length + 1; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }

        System.out.println(dp[length]);

    }
}