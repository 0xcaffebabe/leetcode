/*
 * @lc app=leetcode.cn id=1844 lang=java
 *
 * [1844] 将所有数字用字符替换
 * 
 * 99/99 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 64.26 % of java submissions (39.5 MB)
 */

// @lc code=start
class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i = 1; i < sb.length(); i += 2) {
            sb.setCharAt(i, (char)(sb.charAt(i - 1) + sb.charAt(i) - '0'));
        }
        return sb.toString();
    }
}
// @lc code=end

