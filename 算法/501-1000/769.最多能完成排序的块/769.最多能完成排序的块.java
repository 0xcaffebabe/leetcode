import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=769 lang=java
 *
 * [769] 最多能完成排序的块
 * 
 * 52/52 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 64.28 % of java submissions (38.7 MB)
 */

// @lc code=start
class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        // dp[i] = [0,i]的数组最大值
        int[] dp = new int[n];
        dp[0] = arr[0];
        for(int i = 1; i < n; i++) dp[i] = Math.max(dp[i -1], arr[i]);
        int ans = 0;
        for(int i = 0; i < dp.length; i++) if (dp[i] == i) ans++;

        return ans;
    }
}
// @lc code=end

