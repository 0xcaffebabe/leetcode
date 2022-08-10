/*
 * @lc app=leetcode.cn id=541 lang=java
 *
 * [541] 反转字符串 II
 * 
 * 60/60 cases passed (1 ms)
 * Your runtime beats 60.79 % of java submissions
 * Your memory usage beats 12.72 % of java submissions (41.7 MB)
 */

// @lc code=start
class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < s.length(); i += 2 * k) {
            if (s.length() - 1 - i < k) reverse(sb, i, s.length() - 1);
            else reverse(sb, i, i + k - 1);
        }
        return sb.toString();
    }
    void reverse(StringBuilder sb, int start, int end) {
        while(start <= end) {
            char c1 = sb.charAt(start);
            char c2 = sb.charAt(end);
            sb.setCharAt(start, c2);
            sb.setCharAt(end, c1);
            start++;end--;
        }
    }
}
// @lc code=end

