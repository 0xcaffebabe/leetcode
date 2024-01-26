/*
 * @lc app=leetcode.cn id=2923 lang=java
 * @lcpr version=
 *
 * [2923] 找到冠军 I
 * 
 * 587/587 cases passed (1 ms)
 * Your runtime beats 68.31 % of java submissions
 * Your memory usage beats 5.1 % of java submissions (44.4 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int findChampion(int[][] grid) {
        for(int i = 0; i < grid[0].length; i++) {
            int cnt = 0;
            for(int j = 0; j < grid.length; j++) 
                if (grid[j][i] == 0) cnt++;
            if (cnt == grid[i].length) return i;
        }
        return -1;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[0,1],[0,0]]\n
// @lcpr case=end

// @lcpr case=start
// [[0,0,1],[1,0,1],[0,0,0]]\n
// @lcpr case=end

 */

