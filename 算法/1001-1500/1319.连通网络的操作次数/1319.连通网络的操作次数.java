/*
 * @lc app=leetcode.cn id=1319 lang=java
 * @lcpr version=
 *
 * [1319] 连通网络的操作次数
 * 
 * 36/36 cases passed (23 ms)
 * Your runtime beats 13.36 % of java submissions
 * Your memory usage beats 62.09 % of java submissions (62.8 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    Map<Integer, List<Integer>> graph = new HashMap<>();
    boolean[] visted;
    public int makeConnected(int n, int[][] connections) {
        if (connections.length < n-1) return -1;
        for(var conn: connections) {
            graph.computeIfAbsent(conn[0], k -> new ArrayList<>()).add(conn[1]);
            graph.computeIfAbsent(conn[1], k -> new ArrayList<>()).add(conn[0]);
        }
        visted = new boolean[n];
        int ans = 0;
        for(int i = 0; i < n; i++) {
            if (!visted[i]) {
                dfs(i);
                ans++;
            }
        }
        return ans - 1;
    }

    void dfs(int n) {
        if (visted[n]) return;
        visted[n] = true;
        var next = graph.get(n);
        if (next == null) return;
        for(var i : next) dfs(i);
    }

}
// @lc code=end



/*
// @lcpr case=start
// 4\n[[0,1],[0,2],[1,2]]\n
// @lcpr case=end

// @lcpr case=start
// 6\n[[0,1],[0,2],[0,3],[1,2],[1,3]]\n
// 5\n[[0,1],[0,2],[0,3],[1,2],[1,3]]\n
// @lcpr case=end

// @lcpr case=start
// 6\n[[0,1],[0,2],[0,3],[1,2]]\n
// @lcpr case=end

// @lcpr case=start
// 5\n[[0,1],[0,2],[3,4],[2,3]]\n
// 100\n[[17,51],[33,83],[53,62],[25,34],[35,90],[29,41],[14,53],[40,84],[41,64],[13,68],[44,85],[57,58],[50,74],[20,69],[15,62],[25,88],[4,56],[37,39],[30,62],[69,79],[33,85],[24,83],[35,77],[2,73],[6,28],[46,98],[11,82],[29,72],[67,71],[12,49],[42,56],[56,65],[40,70],[24,64],[29,51],[20,27],[45,88],[58,92],[60,99],[33,46],[19,69],[33,89],[54,82],[16,50],[35,73],[19,45],[19,72],[1,79],[27,80],[22,41],[52,61],[50,85],[27,45],[4,84],[11,96],[0,99],[29,94],[9,19],[66,99],[20,39],[16,85],[12,27],[16,67],[61,80],[67,83],[16,17],[24,27],[16,25],[41,79],[51,95],[46,47],[27,51],[31,44],[0,69],[61,63],[33,95],[17,88],[70,87],[40,42],[21,42],[67,77],[33,65],[3,25],[39,83],[34,40],[15,79],[30,90],[58,95],[45,56],[37,48],[24,91],[31,93],[83,90],[17,86],[61,65],[15,48],[34,56],[12,26],[39,98],[1,48],[21,76],[72,96],[30,69],[46,80],[6,29],[29,81],[22,77],[85,90],[79,83],[6,26],[33,57],[3,65],[63,84],[77,94],[26,90],[64,77],[0,3],[27,97],[66,89],[18,77],[27,43]]\n
// @lcpr case=end

 */

