/*
 * @lc app=leetcode.cn id=841 lang=java
 * @lcpr version=
 *
 * [841] 钥匙和房间
 * 
 * 68/68 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 73.07 % of java submissions (43.1 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.List;

class Solution {
    int n;
    boolean[] visted;
    int cnt = 0;
    List<List<Integer>> rooms;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        n = rooms.size();
        visted = new boolean[n];
        this.rooms = rooms;
        dfs(0);
        return cnt == n;
    }

    void dfs(int v) {
        if (visted[v]) return;
        visted[v] = true;
        cnt++;
        for (var i: rooms.get(v))
            dfs(i);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1],[2],[3],[]]\n
// [[1],[0]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,3],[3,0,1],[2],[0]]\n
// @lcpr case=end

 */

