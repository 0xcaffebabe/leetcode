/*
 * @lc app=leetcode.cn id=680 lang=java
 *
 * [680] 验证回文字符串 Ⅱ
 * 
 * 469/469 cases passed (4 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 5.06 % of java submissions (42.6 MB)
 */

// @lc code=start
class Solution {
    String s;
    public boolean validPalindrome(String s) {
        this.s = s;
        int p = 0;
        int q = s.length() - 1;
        while(p <= q) {
            if (s.charAt(p) == s.charAt(q)) {
                p++;
                q--;
            }else {
                return check(p + 1, q) || check(p, q-1);
            }
        }
        return true;
    }
    boolean check(int p, int q) {
        while(p <= q) {
            if (s.charAt(p) == s.charAt(q)) {
                p++;
                q--;
            }else {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

