/*
 * @lc app=leetcode.cn id=2432 lang=java
 * @lcpr version=21907
 *
 * [2432] 处理用时最长的那个任务的员工
 * 
 * 514/514 cases passed (1 ms)
 * Your runtime beats 98.3 % of java submissions
 * Your memory usage beats 5.11 % of java submissions (42.8 MB)
 */

// @lc code=start
class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int max = logs[0][1];
        int ans = logs[0][0];
        for(int i = 1; i < logs.length; i++) {
            int t = logs[i][1] - logs[i-1][1];
            if (t > max) {
                max = t;
                ans = logs[i][0];
            }
            if (t == max) {
                if (logs[i][0] < ans) ans = logs[i][0];
            }
        }
        return ans;
    }
}
// @lc code=end


// @lcpr case=start
// 10\n[[0,3],[2,5],[0,9],[1,15]]\n
// @lcpr case=end

// @lcpr case=start
// 26\n[[1,1],[3,7],[2,12],[7,17]]\n
// @lcpr case=end

// @lcpr case=start
// 2\n[[0,10],[1,20]]\n
// @lcpr case=end


