/*
 * @lc app=leetcode.cn id=1224 lang=java
 *
 * [1224] 最大相等频率
 * 
 * 45/45 cases passed (8 ms)
 * Your runtime beats 81.11 % of java submissions
 * Your memory usage beats 28.89 % of java submissions (51.7 MB)
 */

// @lc code=start
class Solution {
    public int maxEqualFreq(int[] nums) {
        int[] cnt = new int[100001];
        int[] sum = new int[100001];
        int n = nums.length;
        int max = 0;
        int ans = 0;

        for(int i = 0; i < n; i++) {
            int t= nums[i];
            int currCnt = ++cnt[t];
            int len = i + 1;
            sum[currCnt]++; sum[currCnt - 1]--;
            max = Math.max(max, currCnt);
            if (max == 1) ans = len;
            if (max * sum[max] + 1 == len) ans = len;
            if ((max - 1) * (sum[max - 1] + 1) + 1 == len) ans = len;

        }

        return ans;
    }
}
// @lc code=end

