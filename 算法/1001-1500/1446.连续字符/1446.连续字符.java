/*
 * @lc app=leetcode.cn id=1446 lang=java
 *
 * [1446] 连续字符
 * 
 * 333/333 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 83.36 % of java submissions (39.8 MB)
 */

// @lc code=start
class Solution {
    public int maxPower(String s) {
        int max = 1;
        int ans = 1;
        for(int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                ans++;
                max = Math.max(max, ans);
            }else {
                ans = 1;
            }
        }
        return max;
    }
}
// @lc code=end

