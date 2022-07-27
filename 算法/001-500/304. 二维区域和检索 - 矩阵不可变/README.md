
<https://leetcode-cn.com/problems/range-sum-query-2d-immutable/>

```java
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
```

time: 14 beat: 98

