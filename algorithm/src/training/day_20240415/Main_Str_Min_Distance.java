package training.day_20240415;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息

/**
 * 牛客：数组中两个字符串的最小距离
 */
public class Main_Str_Min_Distance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String[] strs = new String[len];
        String str1 = in.next();
        String str2 = in.next();
        if(len == 0 || str1 == null || str2 == null) {
            System.out.println(-1);
            return;
        }

        // str1 是否存在
        int  str1Index = -1;
        // str2 是否存在
        int str2Index = -1;

        int ans = Integer.MAX_VALUE;


        for(int i = 0;i < len;i++) {
            String s = in.next();
            if(s.equals(str1)) {
                str1Index = i;
            }

            if(s.equals(str2)) {
                str2Index = i;
            }

            if(str1Index != -1 && str2Index != -1) {
                ans = Math.min(ans, Math.abs(str1Index - str2Index));
            }
        }

        if(str1Index == -1 || str2Index == -1) {
            System.out.println(-1);
            return ;
        }

        System.out.println(ans);
    }
}