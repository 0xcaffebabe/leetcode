/*
 * @lc app=leetcode.cn id=1306 lang=java
 * @lcpr version=
 *
 * [1306] 跳跃游戏 III
 * 
 * 56/56 cases passed (2 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 56.17 % of java submissions (56.6 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    boolean[] vis;
    int[] arr;
    public boolean canReach(int[] arr, int start) {
        vis = new boolean[arr.length];
        this.arr = arr;
        return dfs(start);
    }
    boolean dfs(int v) {
        if (v < 0 || v >= vis.length) return false;
        if (vis[v]) return false;
        if (arr[v] == 0) return true;
        vis[v] = true;
        return dfs(v + arr[v]) || dfs(v - arr[v]);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [4,2,3,0,3,1,2]\n5\n
// [0]\n0\n
// @lcpr case=end

// @lcpr case=start
// [4,2,3,0,3,1,2]\n0\n
// @lcpr case=end

// @lcpr case=start
// [3,0,2,1,2]\n2\n
// @lcpr case=end

 */

