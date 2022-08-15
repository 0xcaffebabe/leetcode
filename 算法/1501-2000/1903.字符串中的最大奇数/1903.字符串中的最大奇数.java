/*
 * @lc app=leetcode.cn id=1903 lang=java
 *
 * [1903] 字符串中的最大奇数
 * 
 * 196/196 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 40.34 % of java submissions (42.2 MB)
 */

// @lc code=start
class Solution {
    public String largestOddNumber(String num) {
        for(int i = num.length() - 1; i >= 0; i--) {
            if ((num.charAt(i) - '0') % 2 != 0) return num.substring(0, i + 1);
        }
        return "";
    }
}
// @lc code=end

