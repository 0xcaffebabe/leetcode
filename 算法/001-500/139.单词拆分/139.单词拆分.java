import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=139 lang=java
 *
 * [139] 单词拆分
 * 
 * 45/45 cases passed (6 ms)
 * Your runtime beats 73.1 % of java submissions
 * Your memory usage beats 18.25 % of java submissions (41.9 MB)
 */

// @lc code=start
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        int n = s.length();
        // 字符串[j..i]是否存在 = j 之前的字符串存在 且 [j,i-1]的字符串存在于字典
        // dp[i] = dp[j] && check[j..i-1]
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < i; j++) {
                if (dp[j] && set.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}
// @lc code=end

