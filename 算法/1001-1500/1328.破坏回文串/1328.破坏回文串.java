/*
 * @lc app=leetcode.cn id=1328 lang=java
 *
 * [1328] 破坏回文串
 * 
 * 30/30 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 33.84 % of java submissions (39.7 MB)
 */

// @lc code=start
class Solution {
    public String breakPalindrome(String palindrome) {
        if (palindrome.length() < 2) return "";
        StringBuilder sb = new StringBuilder(palindrome);
        int n = sb.length() / 2;
        boolean done = false;
        for(int i = 0; i < n; i++) {
            if (sb.charAt(i) != 'a') {
                sb.setCharAt(i, 'a');
                done = true;
                break;
            }
        }
        if (!done) sb.setCharAt(sb.length() - 1, 'b');
        return sb.toString();
    }
}
// @lc code=end

