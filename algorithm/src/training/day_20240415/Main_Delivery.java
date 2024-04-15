package training.day_20240415;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息

/**
 * 牛客：牛牛的快递
 */
public class Main_Delivery {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        float weight = in.nextFloat();
        // "y" or "n"
        String optional = in.next();
        int ans = 0;

        // 起步价
        ans += 20;
        weight -= 1.0f;

        // 加急
        if ("y".equals(optional)) {
            ans += 5;
        }

        // 单价
        while (weight > 0) {
            ans += 1;
            weight -= 1.0f;
        }
        System.out.println(ans);
    }
}