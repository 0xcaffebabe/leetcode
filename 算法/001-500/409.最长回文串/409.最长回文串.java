/*
 * @lc app=leetcode.cn id=409 lang=java
 *
 * [409] 最长回文串
 * 
 * 95/95 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 25.15 % of java submissions (39.9 MB)
 */

// @lc code=start
class Solution {
    public int longestPalindrome(String s) {
        int[] map = new int[128];
        for(var c : s.toCharArray()) map[c]++;
        
        int ans = 0;
        boolean remain = false;
        for(int i : map) {
            ans += i - (i % 2);
            if (!remain) remain = i % 2 != 0;
        }
        return remain ? ans + 1 : ans;
    }
}
// @lc code=end

