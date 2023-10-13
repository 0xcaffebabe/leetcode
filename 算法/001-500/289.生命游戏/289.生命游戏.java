/*
 * @lc app=leetcode.cn id=289 lang=java
 * @lcpr version=
 *
 * [289] 生命游戏
 * 
 * 22/22 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 67.39 % of java submissions (39.6 MB)
 */

// @lc code=start
class Solution {
    int[][] board;
    int[][] dirs = {{1,1},{1,0},{0,1},{-1,1},{1,-1},{-1,0},{0,-1},{-1,-1}};
    public void gameOfLife(int[][] board) {
        this.board = board;
        int[][] ans = new int[board.length][board[0].length];
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                int l = life(i, j);
                ans[i][j] = board[i][j];
                if (board[i][j] == 1) {
                    if (l < 2) ans[i][j] = 0;
                    if (l > 3) ans[i][j] = 0;
                } else {
                    if (l == 3) ans[i][j] = 1;
                }
            }
        }
        for(int i = 0; i < board.length; i++) 
            for(int j = 0; j < board[0].length; j++) 
                board[i][j] = ans[i][j];
    }

    int life(int x, int y) {
        int ans = 0;
        for(var dir: dirs) {
            int nx = x + dir[0];
            int ny = y + dir[1];
            if (nx < 0 || ny < 0) continue;
            if (nx >= board.length || ny >= board[0].length) continue;
            if (board[nx][ny] == 1) ans++;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[0,1,0],[0,0,1],[1,1,1],[0,0,0]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,1],[1,0]]\n
// [[1],[0]]\n
// [[0],[1]]\n
// [[1],[1]]\n
// [[0],[0]]\n
// @lcpr case=end

 */

