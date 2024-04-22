package t_leetcode;

/**
 * @author hcUltra
 * @description TODO
 * @date 2024/4/21 12:26
 **/
public class L_74_Search2DMatrix {
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int row = matrix.length;
            int col = matrix[0].length;
            int length = row * col;

            int l = 0, r = length - 1, m = 0;
            while (l <= r) {
                m = l + ((r - l) >> 1);
                int i = m / col;
                int j = m - i * col;
                if (matrix[i][j] > target) {
                    r = m - 1;
                } else if (matrix[i][j] < target) {
                    l = m + 1;
                } else {
                    return true;
                }
            }
            return false;
        }
    }

}
