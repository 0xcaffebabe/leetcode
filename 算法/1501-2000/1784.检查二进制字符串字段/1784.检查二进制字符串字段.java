/*
 * @lc app=leetcode.cn id=1784 lang=java
 * @lcpr version=21912
 *
 * [1784] 检查二进制字符串字段
 * 
 * 191/191 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 78.1 % of java submissions (39.5 MB)
 */

// @lc code=start
class Solution {
    public boolean checkOnesSegment(String s) {
        boolean f = true;
        for(var i : s.toCharArray()) {
            if (i == '1' && f) continue;
            if (i == '1' && !f) return false;
            if (i == '0') f = false;
        }
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "1001"\n
// @lcpr case=end

// @lcpr case=start
// "110"\n
// "1"\n
// "10"\n
// "111"\n
// @lcpr case=end

 */

