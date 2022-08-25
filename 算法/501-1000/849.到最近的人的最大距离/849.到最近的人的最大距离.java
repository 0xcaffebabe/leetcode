/*
 * @lc app=leetcode.cn id=849 lang=java
 *
 * [849] 到最近的人的最大距离
 * 
 * 81/81 cases passed (2 ms)
 * Your runtime beats 88.18 % of java submissions
 * Your memory usage beats 15.85 % of java submissions (43.8 MB)
 */

// @lc code=start
class Solution {
    public int maxDistToClosest(int[] seats) {
        int ans = 0;
        int cnt = 0;
        // 中间最大的连续0的个数
        for(int i = 0; i < seats.length; i++) {
            if (seats[i] == 1) cnt = 0;
            else {
                cnt++;
                ans = Math.max(ans, (cnt + 1) / 2);
            }
        }
        // 前后连续为0的个数
        for(int i = 0; i < seats.length; i++) {
            if (seats[i] == 1) {
                ans = Math.max(ans, i);
                break;
            }
        }
        for(int i = seats.length - 1; i >= 0;i--) {
            if (seats[i] == 1) {
                ans = Math.max(ans, seats.length - i - 1);
                break;
            }
        }
        return ans;
    }
}
// @lc code=end

