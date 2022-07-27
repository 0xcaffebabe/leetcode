/*
 * @lc app=leetcode.cn id=2351 lang=java
 *
 * [2351] 第一个出现两次的字母
 * 
 * 92/92 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 38.23 % of java submissions (39.5 MB)
 * 
 */
// @lc code=start
class Solution {
    public char repeatedCharacter(String s) {
        int[] map = new int[128];
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map[c]++ == 1) return c;
        }
        return '0';
    }
}
// @lc code=end

