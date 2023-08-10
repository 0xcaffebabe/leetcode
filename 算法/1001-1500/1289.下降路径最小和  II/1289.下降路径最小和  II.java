/*
 * @lc app=leetcode.cn id=1289 lang=java
 * @lcpr version=21913
 *
 * [1289] 下降路径最小和  II
 * 
 * 16/16 cases passed (33 ms)
 * Your runtime beats 42.81 % of java submissions
 * Your memory usage beats 80.7 % of java submissions (48.4 MB)
 */

// @lc code=start

class Solution {
    public int minFallingPathSum(int[][] dp) {
        int n = dp.length;
        for(int i = 1; i < n; i++) {
            for(int j = 0; j < n; j++) {
                int min = Integer.MAX_VALUE;
                for(int k = 0; k < n; k++) {
                    if (k != j) min = Math.min(dp[i - 1][k], min);
                }
                dp[i][j] += min;
            }
        }
        int ans = Integer.MAX_VALUE;
        // for(var i : dp) {
        //     System.out.println(Arrays.toString(i));
        // }
        for(int i = 0; i < n; i++) 
            ans = Math.min(ans, dp[n - 1][i]);
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,2,3],[4,5,6],[7,8,9]]\n
// [[7]]\n
// @lcpr case=end

// @lcpr case=start
// [[-73,61,43,-48,-36],[3,30,27,57,10],[96,-76,84,59,-15],[5,-49,76,31,-7],[97,91,61,-46,67]]
// @lcpr case=end

 */

