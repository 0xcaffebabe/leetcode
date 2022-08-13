/*
 * @lc app=leetcode.cn id=79 lang=java
 *
 * [79] 单词搜索
 * 
 * 84/84 cases passed (1967 ms)
 * Your runtime beats 5.02 % of java submissions
 * Your memory usage beats 5.02 % of java submissions (42.3 MB)
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

