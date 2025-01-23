/*
 * @lc app=leetcode.cn id=3248 lang=java
 * @lcpr version=
 *
 * [3248] 矩阵中的蛇
 * 
 * 983/983 cases passed (2 ms)
 * Your runtime beats 72.98 % of java submissions
 * Your memory usage beats 7.69 % of java submissions (43.6 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.List;

class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int i = 0;
        int j = 0;
        for(var c: commands) {
            if (c.equals("UP")) i--;
            if (c.equals("DOWN")) i++;
            if (c.equals("RIGHT")) j++;
            if (c.equals("LEFT")) j--;
        }
        // System.out.println(i + "|" + j);
        return i * n + j;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 2\n["RIGHT","DOWN"]\n
// @lcpr case=end

// @lcpr case=start
// 3\n["DOWN","RIGHT","UP"]\n
// @lcpr case=end

 */

