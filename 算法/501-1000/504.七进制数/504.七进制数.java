/*
 * @lc app=leetcode.cn id=504 lang=java
 *
 * [504] 七进制数
 * 
 * 241/241 cases passed (1 ms)
 * Your runtime beats 77 % of java submissions
 * Your memory usage beats 25.91 % of java submissions (39.2 MB)
 */

// @lc code=start
class Solution {
    public String convertToBase7(int num) {
        if (num == 0) return "0";
        StringBuilder sb = new StringBuilder();
        int n = Math.abs(num);
        while(n > 0) {
            sb.append(n % 7);
            n /= 7;
        }
        if (num < 0) sb.append("-");
        return sb.reverse().toString();
    }
}
// @lc code=end

