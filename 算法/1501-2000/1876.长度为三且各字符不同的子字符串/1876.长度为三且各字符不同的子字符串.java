/*
 * @lc app=leetcode.cn id=1876 lang=java
 *
 * [1876] 长度为三且各字符不同的子字符串
 * 
 * 160/160 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 62.65 % of java submissions (39.6 MB)
 */

// @lc code=start
class Solution {
    public int countGoodSubstrings(String s) {
        int ans = 0;
        int len = s.length() - 1;
        for(int i = 1; i < len; i++) {
            int p = s.charAt(i - 1);
            int c = s.charAt(i);
            int n = s.charAt(i + 1);
            if (p != c && c != n && n != p) ans++;
        }
        return ans;
    }
}
// @lc code=end

