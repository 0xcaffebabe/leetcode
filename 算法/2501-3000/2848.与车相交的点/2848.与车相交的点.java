/*
 * @lc app=leetcode.cn id=2848 lang=java
 * @lcpr version=
 *
 * [2848] 与车相交的点
 * 
 * 807/807 cases passed (2 ms)
 * Your runtime beats 65.71 % of java submissions
 * Your memory usage beats 42.14 % of java submissions (43.4 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.List;

class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        boolean[] m = new boolean[101];
        for(var i: nums) {
            for(int j = i.get(0); j <= i.get(1); j++)
                m[j] = true;
        }
        int ans = 0;
        for(var i : m) if (i) ans++;
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[3,6],[1,5],[4,7]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,3],[5,8]]\n
// [[1,100],[5,8]]\n
// [[1,1],[5,8]]\n
// @lcpr case=end

 */

