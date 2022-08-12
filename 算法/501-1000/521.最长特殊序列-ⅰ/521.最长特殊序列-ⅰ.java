/*
 * @lc app=leetcode.cn id=521 lang=java
 *
 * [521] 最长特殊序列 Ⅰ
 * 
 * 40/40 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 48.83 % of java submissions (39.3 MB)
 */

// @lc code=start
class Solution {
    public int findLUSlength(String a, String b) {
        if (a.equals(b)) return -1;
        return Math.max(a.length(), b.length());
    }
}
// @lc code=end

