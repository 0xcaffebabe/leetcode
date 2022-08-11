/*
 * @lc app=leetcode.cn id=392 lang=java
 *
 * [392] 判断子序列
 * 
 * 18/18 cases passed (4 ms)
 * Your runtime beats 30.13 % of java submissions
 * Your memory usage beats 5.02 % of java submissions (41.9 MB)
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length(); int m = t.length();
        // 字符串 t 从位置i开始首次出现字符j的位置
        int[][] dp = new int[m + 1][26];
        // 最后一个位置首次出现当然就是在最后一个位置
        for(int i = 0; i < 26; i++) dp[m][i] = m;

        // 如果当前的字符等于所要计算的字符j的首次位置，则当前的位置就是其首次出现的位置
        // 否则首次出现的位置等于其之前计算出来的那个位置
        for(int i = m - 1; i >= 0; i--) {
            char c = t.charAt(i);
            for(int j = 0; j < 26; j++) {
                if (c == j + 'a') dp[i][j] = i;
                else dp[i][j] = dp[i + 1][j];
            }
        }
        int prev = 0;
        // 逐个比较s字符串里的每个字符首次出现的位置，如果首次位置是在最后一个位置 那就不用比了
        // 否则下一轮就从上一轮找到的位置往后一格继续
        for(int i = 0; i < n; i++) {
            if (dp[prev][s.charAt(i) - 'a'] == m) return false;
            prev = dp[prev][s.charAt(i) - 'a'] + 1;
        }
        return true;
    }
}
// @lc code=end

