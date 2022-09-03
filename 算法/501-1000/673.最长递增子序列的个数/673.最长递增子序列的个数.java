import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=673 lang=java
 *
 * [673] 最长递增子序列的个数
 * 
 * 223/223 cases passed (19 ms)
 * Your runtime beats 47.96 % of java submissions
 * Your memory usage beats 22.37 % of java submissions (41.3 MB)
 */

// @lc code=start
class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int[] cnt = new int[n];
        int ans = 0;
        int max = 0;
        for(int i = 0; i < n; i++) {
            dp[i] = 1;
            cnt[i] = 1;
            for(int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    if (dp[j] + 1 > dp[i]) {
                        dp[i] = dp[j] + 1;
                        cnt[i] = cnt[j];
                    } else if (dp[j] + 1 == dp[i]) {
                        cnt[i] += cnt[j];
                    }
                }
            }
            if (dp[i] > max) {
                max = dp[i];
                ans = cnt[i];
            } else if (dp[i] == max) {
                ans += cnt[i];
            }
        }
        return ans;
    }
}
// @lc code=end

