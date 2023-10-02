/*
 * @lc app=leetcode.cn id=1605 lang=java
 * @lcpr version=
 *
 * [1605] 给定行和列的和求可行矩阵
 * 
 * 84/84 cases passed (5 ms)
 * Your runtime beats 52.59 % of java submissions
 * Your memory usage beats 24.14 % of java submissions (50.8 MB)
 */

// @lc code=start
class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int[][] ans = new int[rowSum.length][colSum.length];
        for(int i = 0; i < rowSum.length; i++) 
            ans[i][0] = rowSum[i];
        
        for(int i = 0; i < rowSum.length; i++) {
            for(int j = 0; j < colSum.length; j++) {
                if (ans[i][j] > colSum[j]) {
                    ans[i][j + 1] += ans[i][j]  - colSum[j];
                    ans[i][j] = colSum[j];
                    colSum[j] = 0;
                } else {
                    colSum[j] -= ans[i][j];
                }
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,8]\n[4,7]\n
// @lcpr case=end

// @lcpr case=start
// [5,7,10]\n[8,6,8]\n
// @lcpr case=end

// @lcpr case=start
// [14,9]\n[6,9,8]\n
// @lcpr case=end

// @lcpr case=start
// [1,0]\n[1]\n
// @lcpr case=end

// @lcpr case=start
// [0]\n[0]\n
// @lcpr case=end

 */

