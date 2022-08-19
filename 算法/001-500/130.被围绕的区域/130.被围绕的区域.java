/*
 * @lc app=leetcode.cn id=130 lang=java
 *
 * [130] 被围绕的区域
 * 
 * 58/58 cases passed (1 ms)
 * Your runtime beats 99.92 % of java submissions
 * Your memory usage beats 84.68 % of java submissions (43.2 MB)
 */

// @lc code=start
class Solution {
    int m;
    int n;
    char[][] board;
    public void solve(char[][] board) {
        this.board = board;
        m = board.length;
        n = board[0].length;
        // 先dfs寻找可以从边界达到的O点，设置为A
        for(int i = 0; i < m; i++) {
            dfs(i, 0);
            dfs(i,  n - 1);
        }
        for(int i = 1; i < n; i++) {
            dfs(0, i);
            dfs(m - 1,  i);
        }
        // 再遍历每个点 发现O点就置为X A点就是可以从边界达到的O点，还原
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if (board[i][j] == 'A') board[i][j] = 'O';
                else if (board[i][j] == 'O') board[i][j] = 'X';
            }
        }
    }

    void dfs(int i, int j) {
        if (i < 0 || j < 0 || i >= m || j >= n) return;
        if (board[i][j] != 'O') return;
        // System.out.println(i + "|" + j);
        board[i][j] = 'A';
        dfs(i - 1, j);
        dfs(i + 1, j);
        dfs(i, j - 1);
        dfs(i, j + 1);
    }
}
// @lc code=end

