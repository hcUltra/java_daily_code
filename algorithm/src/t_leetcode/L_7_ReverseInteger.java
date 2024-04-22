package t_leetcode;

/**
 * @author hcUltra
 * @description TODO
 * @date 2024/4/20 18:19
 **/
public class L_7_ReverseInteger {
    class Solution {
        public int reverse(int x) {
            long res = 0;
            while (x != 0) {
                int mod = x % 10;
                res = res * 10 + mod;
                x /= 10;
            }
            if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
                return 0;
            }
            return (int) res;
        }
    }
}
