package t_leetcode;

/**
 * @author hcUltra
 * @description TODO
 * @date 2024/4/18 20:22
 **/
public class L_69_SqrtX {
    static class Solution {
        private final double eps = 1e-6;

        public int mySqrt(int x) {
            double l = 0, r = x, m = 0;
            while (r - l > eps) {
                m = (l + r) / 2;
                if (m * m < x) {
                    l = m;
                } else {
                    r = m;
                }
            }
            return (int) r;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().mySqrt(4));
    }

}
