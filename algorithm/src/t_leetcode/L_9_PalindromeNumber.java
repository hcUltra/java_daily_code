package t_leetcode;

/**
 * @author hcUltra
 * @description TODO
 * @date 2024/4/21 12:24
 **/
public class L_9_PalindromeNumber {
    class Solution {
        public boolean isPalindrome(int x) {
            if(x < 0) return false;
            int t = x;
            int rx = 0;
            while(t != 0) {
                rx = rx * 10 + t % 10;
                t /= 10;
            }
            return rx == x;
        }
    }
}
