/*
 * @lc app=leetcode.cn id=剑指 Offer II 116 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 116] 省份数量
 * 
 * 113/113 cases passed (1 ms)
 * Your runtime beats 86.26 % of java submissions
 * Your memory usage beats 9.48 % of java submissions (43.1 MB)
 */

// @lc code=start
class Solution {
    int n;
    int[][] isConnected;
    boolean[] visted;
    public int findCircleNum(int[][] isConnected) {
        this.isConnected = isConnected;
        n = isConnected.length;
        this.visted = new boolean[n];
        int ans = 0;
        for(int i = 0; i < n; i++) {
            if (!visted[i]) {
                ans++;
                dfs(i);
            }
        }
        return ans;
    }
    void dfs(int i) {
        if (visted[i]) return;

        visted[i] = true;
        for(int j = 0; j < n; j++) {
            if (isConnected[i][j] == 1) dfs(j);
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,1,0],[1,1,0],[0,0,1]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,0,0],[0,1,0],[0,0,1]]\n
// @lcpr case=end

 */

