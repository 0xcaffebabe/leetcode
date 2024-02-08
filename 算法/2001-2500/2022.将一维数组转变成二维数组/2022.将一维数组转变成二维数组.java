/*
 * @lc app=leetcode.cn id=2022 lang=java
 * @lcpr version=
 *
 * [2022] 将一维数组转变成二维数组
 * 
 * 107/107 cases passed (3 ms)
 * Your runtime beats 98.1 % of java submissions
 * Your memory usage beats 91.47 % of java submissions (53.2 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m * n) return new int[0][0];
        int cnt = 0;
        int[][] ans = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) 
                ans[i][j] = original[cnt++];
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,4]\n2\n2\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3]\n1\n3\n
// @lcpr case=end

// @lcpr case=start
// [1,2]\n1\n1\n
// @lcpr case=end

// @lcpr case=start
// [3]\n1\n2\n
// [3,1,2]\n1\n2\n
// [1,1,1,1]\n4\n1
// @lcpr case=end

 */

