/*
 * @lc app=leetcode.cn id=2639 lang=java
 * @lcpr version=
 *
 * [2639] 查询网格图中每一列的宽度
 * 
 * 49/49 cases passed (6 ms)
 * Your runtime beats 51.85 % of java submissions
 * Your memory usage beats 62.22 % of java submissions (43.1 MB)
 */

// @lc code=start
class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int[] ans = new int[grid[0].length];
        for(int i = 0; i < grid[0].length; i++) {
            int max = 0;
            for(int j = 0; j < grid.length; j++) 
                max = Math.max(max, String.valueOf(grid[j][i]).length());
            ans[i] = max;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1],[22],[333]]\n
// @lcpr case=end

// @lcpr case=start
// [[-15,1,3],[15,7,12],[5,6,-2]]\n
// @lcpr case=end

 */

