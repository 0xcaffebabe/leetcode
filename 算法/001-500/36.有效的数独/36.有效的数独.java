/*
 * @lc app=leetcode.cn id=36 lang=java
 *
 * [36] 有效的数独
 * 
 * 507/507 cases passed (1 ms)
 * Your runtime beats 99.44 % of java submissions
 * Your memory usage beats 99.61 % of java submissions (40.7 MB)
 */

// @lc code=start
class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9 ; j++) {
                char c = board[i][j];
                if (c == '.') continue;
                for(int r = 0; r < 9; r++) {
                    if (r == i) continue;
                    if (board[r][j] == c) return false;
                }
                for(int col = 0; col < 9; col++) {
                    if (col == j) continue;
                    if (board[i][col] == c) return false;
                }
                int rIndex = i / 3;
                int cIndex = j / 3;
                for(int rr = rIndex * 3; rr < rIndex * 3 + 3; rr++) {
                    for(int cc = cIndex * 3; cc < cIndex * 3 + 3; cc++) {
                        if (rr == i && cc == j) continue;
                        if (board[rr][cc] == c) return false;
                    }
                }
            }
        }
        return true;
    }
}
// @lc code=end

