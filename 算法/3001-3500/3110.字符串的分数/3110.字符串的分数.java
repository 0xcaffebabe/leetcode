/*
 * @lc app=leetcode.cn id=3110 lang=java
 * @lcpr version=
 *
 * [3110] 字符串的分数
 * 
 * 705/705 cases passed (1 ms)
 * Your runtime beats 50.43 % of java submissions
 * Your memory usage beats 5.51 % of java submissions (41.3 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int scoreOfString(String s) {
        int ans = 0;
        for(int i = 0; i < s.length() - 1; i++) 
            ans += Math.abs(s.charAt(i) - s.charAt(i + 1));
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "hello"\n
// @lcpr case=end

// @lcpr case=start
// "zaz"\n
// "ab"\n
// @lcpr case=end

 */

