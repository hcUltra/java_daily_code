package t_leetcode;

/**
 * @author hcUltra
 * @description TODO
 * @date 2024/4/18 21:16
 **/
public class L_441_ArrangingCoins {
    static class Solution {
        public int arrangeCoins(int n) {
            int l = 1, r = n, m = 0, ans = 0;
            while (l <= r) {
                m = l + ((r - l) >> 1);
                if (f(m) <= (long)n) {
                    ans = m;
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
            return ans;
        }
        public long f(int n) {
            return ((long) 1 + n) * n / 2;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().arrangeCoins(1804289383));
    }
}
