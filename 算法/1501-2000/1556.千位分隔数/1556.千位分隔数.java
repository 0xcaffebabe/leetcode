/*
 * @lc app=leetcode.cn id=1556 lang=java
 *
 * [1556] 千位分隔数
 * 
 * 69/69 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 53.4 % of java submissions (38.7 MB)
 */

// @lc code=start
class Solution {
    public String thousandSeparator(int n) {
        var s = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= s.length(); i++) {
            sb.insert(0, s.charAt(s.length() - i));
            if (i % 3 == 0) sb.insert(0, ".");
        }
        if (sb.charAt(0) == '.') sb.delete(0, 1);
        return sb.toString();
    }
}
// @lc code=end

