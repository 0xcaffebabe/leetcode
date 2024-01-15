/*
 * @lc app=leetcode.cn id=743 lang=java
 * @lcpr version=
 *
 * [743] 网络延迟时间
 * 
 * 53/53 cases passed (4 ms)
 * Your runtime beats 75.55 % of java submissions
 * Your memory usage beats 5.18 % of java submissions (48.3 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;

class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int[][] graph = new int[n][n];
        int INF = Integer.MAX_VALUE / 2;
        for(var i : graph) Arrays.fill(i, INF);
        for(var t: times) graph[t[0]-1][t[1]-1] = t[2];

        int[] dis = new int[n];
        Arrays.fill(dis, INF);
        dis[k-1] = 0;
        boolean[] visted = new boolean[n];
        for(int i = 0; i < n; i++) {
            int x = -1;
            // 找到前节点最近的节点 x
            for(int y = 0; y < n; y++) {
                if (!visted[y] && (x == -1 || dis[y] < dis[x]))
                    x = y;
            }
            visted[x] = true;
            // 更新到 y 节点的最短路径为 x 到 y 的距离加上 x 之前的距离
            for(int y = 0; y < n; y++) 
                dis[y] = Math.min(dis[y], dis[x] + graph[x][y]);
            
        }
        int ans = Arrays.stream(dis).max().getAsInt();
        return ans == INF ? -1 : ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// // [[1,2,1],[2,3,2],[1,3,2]]\n3\n1\n
// @lcpr case=end

// @lcpr case=start
// [[2,1,1],[2,3,1],[3,4,1]]\n4\n2\n
// @lcpr case=end

// @lcpr case=start
// [[1,2,1]]\n2\n1\n
// [[1,2,0]]\n2\n1\n
// @lcpr case=end

// @lcpr case=start
// [[1,2,1]]\n2\n2\n
// [[1,2,1],[3,4,1]]\n4\n1\n
// [[1,3,0]]\n3\n1\n
// [[1,2,1],[2,3,7],[1,3,4],[2,1,2]]\n4\n1\n
// @lcpr case=end

 */

