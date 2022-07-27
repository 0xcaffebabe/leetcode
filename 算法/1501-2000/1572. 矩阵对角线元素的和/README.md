```java
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = - 1;
        if (mat.length % 2 != 0) n = mat.length / 2 + 1;
        for(int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
            sum += mat[mat.length - i - 1][i];
        }
        
        if (n != -1) sum -= mat[n-1][n-1];
        return sum;
    }
}
```

time:0 beat:100