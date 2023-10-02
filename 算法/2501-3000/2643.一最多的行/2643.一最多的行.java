/*
 * @lc app=leetcode.cn id=2643 lang=java
 * @lcpr version=
 *
 * [2643] 一最多的行
 * 
 * 1049/1049 cases passed (5 ms)
 * Your runtime beats 83.21 % of java submissions
 * Your memory usage beats 33.96 % of java submissions (43.9 MB)
 */

// @lc code=start
class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max = 0;
        int pos = 0;
        for(int i = 0; i < mat.length; i++) {
            int cnt = 0;
            for(int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) cnt++;
            }
            if (cnt > max) {
                max = cnt;
                pos = i;
            }
        }
        return new int[]{pos, max};
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[0,1],[1,0]]\n
// @lcpr case=end

// @lcpr case=start
// [[0,0,0],[0,1,1]]\n
// @lcpr case=end

// @lcpr case=start
// [[0,0],[1,1],[0,0]]\n
// @lcpr case=end

 */

