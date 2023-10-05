/*
 * @lc app=leetcode.cn id=419 lang=java
 * @lcpr version=
 *
 * [419] 甲板上的战舰
 * 
 * 27/27 cases passed (1 ms)
 * Your runtime beats 35.4 % of java submissions
 * Your memory usage beats 80.54 % of java submissions (42.5 MB)
 */

// @lc code=start
class Solution {
    int ans = 0;
    char[][] board;
    boolean[][] visted;
    int[][] dirs = {{1,0},{0,1},{-1,0},{0,-1}};
    public int countBattleships(char[][] board) {
        this.board = board;
        visted = new boolean[board.length][board[0].length];
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if (visted[i][j]) continue;
                if (board[i][j] == 'X') {
                    ans++;
                    for(var dir: dirs) 
                        dfs(i + dir[0], j + dir[1]);
                }
            }
        }
        return ans;
    }

    void dfs(int x, int y) {
        if (x < 0 || y < 0) return;
        if (x >= board.length || y >= board[0].length) return;
        if (visted[x][y]) return;
        if (board[x][y] != 'X') return;
        visted[x][y] = true;
        for(var dir: dirs)
            dfs(x + dir[0], y + dir[1]);
    }

}
// @lc code=end



/*
// @lcpr case=start
// [["X",".",".","X"],[".",".",".","X"],[".",".",".","X"]]\n
// @lcpr case=end

// @lcpr case=start
// [["."]]\n
// @lcpr case=end

 */

