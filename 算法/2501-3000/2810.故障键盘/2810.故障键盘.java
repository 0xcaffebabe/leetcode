/*
 * @lc app=leetcode.cn id=2810 lang=java
 * @lcpr version=
 *
 * [2810] 故障键盘
 * 
 * 3005/3005 cases passed (3 ms)
 * Your runtime beats 73.76 % of java submissions
 * Your memory usage beats 42.62 % of java submissions (42.7 MB)
 */

// @lc code=start
class Solution {
    public String finalString(String s) {
        StringBuilder sb = new StringBuilder();
        for(var i : s.toCharArray()) {
            if (i == 'i') sb.reverse();
            else sb.append(i);
        }
        return sb.toString();
    }
}
// @lc code=end



/*
// @lcpr case=start
// "string"\n
// @lcpr case=end

// @lcpr case=start
// "poiinter"\n
// "piiiiiii"\n
// "pi"\n
// "p"\n
// @lcpr case=end

 */

