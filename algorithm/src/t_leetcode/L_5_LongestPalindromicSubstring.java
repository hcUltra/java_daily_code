package t_leetcode;

/**
 * @author hcUltra
 * @description TODO
 * @date 2024/4/20 18:17
 **/
public class L_5_LongestPalindromicSubstring {
    class Solution {
        public String longestPalindrome(String s) {
            String res = "";
            int l, r;
            for (int i = 0; i < s.length(); i++) {
                l = i - 1;
                r = i + 1;
                while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                    r++;
                    l--;
                }
                // (l,r) 内是有效的回文串 len = (r - 1) - (l + 1) + 1 = r - 1 - l - 1 + 1 = r - l - 1
                if (r - l - 1 > res.length()) {
                    // [l+1,r)
                    res = s.substring(l + 1, r);
                }

                l = i;
                r = i + 1;
                while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                    r++;
                    l--;
                }
                // (l,r) 内是有效的回文串 len = (r - 1) - (l + 1) + 1 = r - 1 - l - 1 + 1 = r - l - 1
                if (r - l - 1 > res.length()) {
                    // [l+1,r)
                    res = s.substring(l + 1, r);
                }
            }
            return res;
        }
    }
}
