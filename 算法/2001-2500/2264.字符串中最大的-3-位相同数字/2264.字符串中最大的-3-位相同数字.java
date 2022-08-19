/*
 * @lc app=leetcode.cn id=2264 lang=java
 *
 * [2264] 字符串中最大的 3 位相同数字
 * 
 * 141/141 cases passed (7 ms)
 * Your runtime beats 19.19 % of java submissions
 * Your memory usage beats 36.02 % of java submissions (40.6 MB)
 */

// @lc code=start
class Solution {
    public String largestGoodInteger(String num) {
        int max = 0;
        for(int i = 1; i < num.length() - 1; i++) {
            char p = num.charAt(i - 1);
            char c = num.charAt(i);
            char n = num.charAt(i + 1);
            if (p == c && p == n) {
                if (p == '9') return "999";
                max = Math.max(p, max);
            }
        }
        if (max == 0) return "";
        return "" + (char)(max)+(char)(max)+(char)(max);
    }
}
// @lc code=end

