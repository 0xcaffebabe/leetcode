/*
 * @lc app=leetcode.cn id=733 lang=java
 *
 * [733] 图像渲染
 * 
 * 277/277 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 46.71 % of java submissions (42.3 MB)
 */

// @lc code=start
class Solution {
    int[][] image;
    int m;
    int n;
    int newColor;
    int oriColor;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        this.image = image;
        this.newColor = color;
        this.oriColor = image[sr][sc];
        this.m = image.length;
        this.n = image[0].length;
        dfs(sr, sc);
        return image;
    }

    void dfs(int r, int c) {
        if (r < 0 || c < 0 || r >= m || c >= n) return;
        if (image[r][c] != oriColor || image[r][c] == newColor) return;
        image[r][c] = newColor;
        dfs(r + 1, c);
        dfs(r - 1, c);
        dfs(r, c + 1);
        dfs(r, c - 1);
    }
}
// @lc code=end

