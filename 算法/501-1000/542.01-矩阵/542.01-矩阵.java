import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=542 lang=java
 *
 * [542] 01 矩阵
 * 
 * 50/50 cases passed (10 ms)
 * Your runtime beats 76.34 % of java submissions
 * Your memory usage beats 87.57 % of java submissions (43.4 MB)
 */

// @lc code=start
class Solution {
    int[][] mat;
    int m;
    int n;
    public int[][] updateMatrix(int[][] mat) {
        m = mat.length;
        n = mat[0].length;
        this.mat = mat;
        LinkedList<int[]> que = new LinkedList<>();
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if (mat[i][j] == 0) que.offer(new int[]{i, j});
                else mat[i][j] = -1;
            }
        }
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};
        while(!que.isEmpty()) {
            var pot = que.pop();
            int r = pot[0];
            int c = pot[1];
            for(int i = 0; i < 4; i++) {
                int rr = r + dx[i];
                int cc = c + dy[i];
                if (rr < 0 || cc < 0 || rr >= m || cc >= n) continue;
                // 如果当前节点上下左右某个节点a为-1（需要被处理的节点）
                // 就将点a的距离等于当前节点的距离+1
                if (mat[rr][cc] == -1) {
                    mat[rr][cc] = mat[r][c] + 1;
                    // 后续需要再对点a周边的点进行搜索，所以加入队列
                    que.offer(new int[]{rr,cc});
                }
                
            }
        }
        return mat;
    }
}
// @lc code=end

