/*
 * @lc app=leetcode.cn id=1957 lang=java
 *
 * [1957] 删除字符使字符串变好
 * 
 * 306/306 cases passed (1995 ms)
 * Your runtime beats 5.13 % of java submissions
 * Your memory usage beats 75 % of java submissions (42.2 MB)
 */

// @lc code=start
class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i = 1; i < sb.length() - 1; i++) {
            int p = sb.charAt(i - 1);
            int c = sb.charAt(i);
            int n = sb.charAt(i + 1);
            if (c == p && c == n) {
                sb.delete(i- 1, i);
                i--;
            }
            
        }
        return sb.toString();
    }
}
// @lc code=end

