
<https://leetcode-cn.com/problems/transpose-matrix/>

```java
class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] reversed = new int[matrix[0].length][matrix.length];
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[i].length;j++){
                reversed[j][i] = matrix[i][j];
            }
        }
        return reversed;
    }
}
```

time: 1 beat: 38

