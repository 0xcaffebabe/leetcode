/*
 * @lc app=leetcode.cn id=2078 lang=java
 * @lcpr version=
 *
 * [2078] 两栋颜色不同且距离最远的房子
 * 
 * 126/126 cases passed (2 ms)
 * Your runtime beats 10.77 % of java submissions
 * Your memory usage beats 22.57 % of java submissions (39.4 MB)
 */

// @lc code=start
class Solution {
    public int maxDistance(int[] colors) {
        int ans = 0;
        for(int i = 0; i < colors.length - 1; i++) {
            for(int j = i + 1; j < colors.length; j++) {
                if (colors[i] == colors[j]) continue;
                ans = Math.max(ans, Math.abs(i - j));
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,1,1,6,1,1,1]\n
// @lcpr case=end

// @lcpr case=start
// [1,8,3,8,3]\n
// @lcpr case=end

// @lcpr case=start
// [0,1]\n
// @lcpr case=end

 */

