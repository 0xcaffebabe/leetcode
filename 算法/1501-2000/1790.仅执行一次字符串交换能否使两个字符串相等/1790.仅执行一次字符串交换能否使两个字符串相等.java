/*
 * @lc app=leetcode.cn id=1790 lang=java
 *
 * [1790] 仅执行一次字符串交换能否使两个字符串相等
 * 
 * 131/131 cases passed (1 ms)
 * Your runtime beats 42.5 % of java submissions
 * Your memory usage beats 89.58 % of java submissions (39.4 MB)
 */

// @lc code=start
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int a = -1; int b = -1;
        for(int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) continue;
            if (a == -1) a = i;
            else if (b == -1) b = i;
            else return false;
        }
        if (a == -1 && b == -1) return true;
        if (a == -1 || b == -1) return false;
        return s1.charAt(a) == s2.charAt(b) && s1.charAt(b) == s2.charAt(a);
    }
}
// @lc code=end

