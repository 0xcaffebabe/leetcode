import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=994 lang=java
 *
 * [994] 腐烂的橘子
 * 
 * 306/306 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 32.81 % of java submissions (41.1 MB)
 */

// @lc code=start
class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        LinkedList<int[]> que = new LinkedList<>();
        // 新鲜橘子的数量
        int cnt = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if (grid[i][j] == 2) que.offer(new int[]{i, j});
                else if (grid[i][j] == 1) cnt++;
            }
        }
        int[] dr = {-1,1,0,0};
        int[] dc = {0,0,1,-1};
        int round = 0;
        // cnt > 0 ： 橘子都烂光了，就没必要继续搜索，不然round就不是最小的了
        while(cnt > 0 && !que.isEmpty()) {
            round++;
            // 这一轮需要处理的节点数量
            int k = que.size();
            for(int i = 0; i < k; i++) {
                var pot = que.pop();
                int r = pot[0];
                int c = pot[1];
                for(int j = 0; j < 4; j++) {
                    int rr = r + dr[j];
                    int cc = c + dc[j];
                    if (rr < 0 || cc < 0 || rr >= m || cc >= n) continue;
                    // 腐烂掉邻边橘子
                    if (grid[rr][cc] == 1) {
                        grid[rr][cc] = 2;
                        cnt--;
                        que.offer(new int[]{rr, cc});
                    }
                }
            }
        }
        if (cnt > 0) return -1;
        return round;
    }
}
// @lc code=end

