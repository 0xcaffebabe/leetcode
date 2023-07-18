/*
 * @lc app=leetcode.cn id=剑指 Offer 12 lang=java
 * @lcpr version=21909
 *
 * [剑指 Offer 12] 矩阵中的路径
 * 
 * 83/83 cases passed (1535 ms)
 * Your runtime beats 5.06 % of java submissions
 * Your memory usage beats 7.34 % of java submissions (42.9 MB)
 */

// @lc code=start
class Solution {
    char[][] board;
    boolean[][] vis;
    String word;
    boolean exist;
    public boolean exist(char[][] board, String word) {
        this.board = board;
        this.vis = new boolean[board.length][board[0].length];
        this.word = word;
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) travel(i, j, "");
        }
        return exist;
    }
    void travel(int x, int y, String path)  {
        if (path.length() == word.length() && path.equals(word)) {
            exist = true;
            return;
        }
        if (x < 0 || y < 0 || y >= board[0].length || x >= board.length) return;
        // 剪枝?
        if (path.length() > word.length()) return;
        for(int i = 0; i < path.length(); i++) {
            if (path.charAt(i) != word.charAt(i)) return;
        }

        // System.out.println(path);
        if (vis[x][y]) return;
        path = path + board[x][y];
        vis[x][y] = true;
        travel(x - 1, y, path);
        travel(x + 1, y, path);
        travel(x, y - 1, path);
        travel(x, y + 1, path);
        vis[x][y] = false;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]]\n"ABCCED"\n
// @lcpr case=end

// @lcpr case=start
// [["a","b"],["c","d"]]\n"abcd"\n
// @lcpr case=end

 */

