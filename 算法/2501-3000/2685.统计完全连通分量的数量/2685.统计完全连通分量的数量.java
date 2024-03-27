/*
 * @lc app=leetcode.cn id=2685 lang=java
 * @lcpr version=
 *
 * [2685] 统计完全连通分量的数量
 * 
 * 3354/3354 cases passed (23 ms)
 * Your runtime beats 14.58 % of java submissions
 * Your memory usage beats 47.92 % of java submissions (44.1 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    boolean[][] g;
    boolean[] visted;
    int n;
    public int countCompleteComponents(int n, int[][] edges) {
        this.n = n;
        g = new boolean[n][n];
        visted = new boolean[n];
        for(var e: edges) {
            g[e[0]][e[1]] = true;
            g[e[1]][e[0]] = true;
        }

        List<List<Integer>> compoments = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            List<Integer> compoment = new ArrayList<>();
            dfs(i, compoment);
            if (!compoment.isEmpty()) compoments.add(compoment);
        }

        int ans = 0;
        for(var compoment: compoments) {
            int edgeNum = 0;
            for(var i : compoment) {
                for(var j: compoment) {
                    if (g[i][j]) edgeNum++;
                }
            }
            edgeNum /= 2;
            int m = compoment.size();
            if (edgeNum == m*(m-1)/2) ans++;
            // System.out.println(compoment + "," + edgeNum);
        }
        return ans;
    }

    void dfs(int v, List<Integer> component) {
        if (visted[v]) return;
        visted[v] = true;
        component.add(v);
        for(int i = 0; i < n; i++) {
            if (g[v][i]) dfs(i, component);
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// 6\n[[0,1],[0,2],[1,2],[3,4]]\n
// 1\n[]\n
// 2\n[[0,1]]\n
// 2\n[]\n
// 3\n[[1,2]]\n
// @lcpr case=end

// @lcpr case=start
// 6\n[[0,1],[0,2],[1,2],[3,4],[3,5]]\n
// @lcpr case=end

 */

