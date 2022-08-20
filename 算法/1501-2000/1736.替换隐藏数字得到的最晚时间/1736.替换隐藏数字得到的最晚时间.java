/*
 * @lc app=leetcode.cn id=1736 lang=java
 *
 * [1736] 替换隐藏数字得到的最晚时间
 * 
 * 159/159 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 83.53 % of java submissions (39.4 MB)
 */

// @lc code=start
class Solution {
    public String maximumTime(String time) {
        StringBuilder sb = new StringBuilder(time);
        if (sb.charAt(0) == '?') {
            if (sb.charAt(1) == '?' || sb.charAt(1) < '4') sb.setCharAt(0, '2');
            else sb.setCharAt(0, '1');
        }
        
        if (sb.charAt(1) == '?') {
            if (sb.charAt(0) == '2') sb.setCharAt(1, '3');
            else sb.setCharAt(1, '9');
        }

        if (sb.charAt(3) == '?') sb.setCharAt(3, '5');
        if (sb.charAt(4) == '?') sb.setCharAt(4, '9');

        return sb.toString();
    }
}
// @lc code=end

