/*
 * @lc app=leetcode.cn id=1422 lang=java
 *
 * [1422] 分割字符串的最大得分
 * 
 * 104/104 cases passed (1 ms)
 * Your runtime beats 94.26 % of java submissions
 * Your memory usage beats 88.18 % of java submissions (39.2 MB)
 */

// @lc code=start
class Solution {
    public int maxScore(String s) {
        int zero = s.charAt(0) == '0' ? 1 : 0;
        int one = 0;
        for(int i = 1; i < s.length(); i++) if (s.charAt(i) == '1') one++;
        int ans = one + zero;
        for(int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') zero++;
            else one--;
            ans = Math.max(ans, one + zero);
        }
        return ans;
    }
}
// @lc code=end

