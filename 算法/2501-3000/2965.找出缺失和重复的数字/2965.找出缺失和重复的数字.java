/*
 * @lc app=leetcode.cn id=2965 lang=java
 * @lcpr version=
 *
 * [2965] 找出缺失和重复的数字
 * 
 * 584/584 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 10.21 % of java submissions (44.3 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] m = new int[grid.length * grid.length + 1];
        for(var i : grid)
            for (var j : i) m[j]++;
        int[] ans = new int[2];
        for(int i = 1; i < m.length; i++) {
            if (m[i] == 2) ans[0] = i;
            if (m[i] == 0) ans[1] = i;
        }
        return ans;
        
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,3],[2,2]]\n
// @lcpr case=end

// @lcpr case=start
// [[9,1,7],[8,9,2],[3,4,6]]\n
// @lcpr case=end

 */

