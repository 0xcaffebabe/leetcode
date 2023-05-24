/*
 * @lc app=leetcode.cn id=剑指 Offer II 013 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 013] 二维子矩阵的和
 * 41ms/100%
 */

// @lc code=start
class NumMatrix {
    private int[][] cache;
    public NumMatrix(int[][] matrix) {
        if (matrix.length == 0) cache = new int[0][0];
        else cache = new int[matrix.length][matrix[0].length];
        
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j< matrix[i].length;j++){
                cache[i][j] = matrix[i][j];
            }
        }
        for(int i = 0;i<matrix.length;i++){
            for(int j = 1;j< matrix[i].length;j++){
                cache[i][j] += cache[i][j-1];
            }
        }
        for(int i = 1;i<matrix.length;i++){
            for(int j = 0;j< matrix[i].length;j++){
                cache[i][j] += cache[i-1][j];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        if (cache.length == 0) return 0;
        if (row1 == 0 && col1 == 0) return cache[row2][col2];
        if (row1 == 0) return cache[row2][col2] - cache[row2][col1-1];
        if (col1 == 0) return cache[row2][col2] - cache[row1-1][col2];
        
        return cache[row2][col2] - cache[row1-1][col2] - (cache[row2][col1-1] - cache[row1-1][col1-1]);
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
// @lc code=end



/*
// @lcpr case=start
// ["NumMatrix","sumRegion","sumRegion","sumRegion"]\n[[[[3,0,1,4,2],[5,6,3,2,1],[1,2,0,1,5],[4,1,0,1,7],[1,0,3,0,5]]],[2,1,4,3],[1,1,2,2],[1,2,2,4]]\n
// @lcpr case=end

 */

