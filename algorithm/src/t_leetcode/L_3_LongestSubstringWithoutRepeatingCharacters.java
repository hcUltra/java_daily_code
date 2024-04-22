package t_leetcode;

import java.util.Arrays;

/**
 * @author hcUltra
 * @description TODO
 * @date 2024/4/19 20:33
 **/
public class L_3_LongestSubstringWithoutRepeatingCharacters {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            char[] arr = s.toCharArray();
            // 记录某个字符上一次出现的位置
            int[] last = new int[256];
            Arrays.fill(last, -1);
            int ans = 0;
            // 以某个字符的结尾位置进行枚举
            // 找出以某个字符结尾的无重复的最长子串
            // 由于每次只加入一个字符，所以最多就是加入的字符与前一个窗口中的某个字符重复
            for (int l = 0, r = 0; r < arr.length; r++) {
                l = Math.max(l, last[arr[r]] + 1);
                ans = Math.max(ans, r - l + 1);
                last[arr[r]] = r;
            }

            return ans;
        }
    }
}
