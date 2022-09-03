import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=1091 lang=java
 *
 * [1091] 二进制矩阵中的最短路径
 * 
 * 89/89 cases passed (10 ms)
 * Your runtime beats 95.5 % of java submissions
 * Your memory usage beats 78.69 % of java submissions (42.5 MB)
 */

// @lc code=start
class Solution {
    int n;
    int[][] grid;
    int[] dx = {0,0,1,1,1,-1,-1,-1};
    int[] dy = {1,-1,0,1,-1,0,-1,1};
    public int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0] == 1) return -1;
        n = grid.length;
        this.grid = grid;
        LinkedList<int[]> que = new LinkedList<>();
        que.offer(new int[]{0,0});
        grid[0][0] = 1;
        int ans = 1;
        while(!que.isEmpty()) {
            int rou = que.size();
            for(int i = 0; i < rou; i++) {
                var pot = que.pop();
                int r = pot[0];
                int c = pot[1];
                if (r == n - 1 && c == n - 1) return ans;
                for(int j = 0; j < 8; j++) {
                    int rr = r + dx[j];
                    int cc = c + dy[j];
                    if (rr < 0 || cc < 0 || rr >= n || cc >= n) continue;
                    if (grid[rr][cc] == 1) continue;
                    grid[rr][cc] = 1;
                    que.offer(new int[]{rr,cc});
                }
            }
            ans++;
        }
        return -1;
    }
}
// @lc code=end

