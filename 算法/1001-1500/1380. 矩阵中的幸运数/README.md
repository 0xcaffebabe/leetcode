
<https://leetcode-cn.com/problems/lucky-numbers-in-a-matrix/>

```java
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ret = new ArrayList<>(16);
        Set<Integer> maxSet = new HashSet<>();

        for(int i = 0;i<matrix[0].length;i++) {
            int max = Integer.MIN_VALUE;
            for(int j = 0;j<matrix.length;j++) {
                if (matrix[j][i] > max) max = matrix[j][i];
            }
            maxSet.add(max);
        }

        for(int i = 0;i<matrix.length;i++) {
            int min = Integer.MAX_VALUE;
            for(int j = 0;j<matrix[i].length;j++) {
                if (matrix[i][j] < min) min = matrix[i][j];
            }

            if (maxSet.contains(min)) ret.add(min);
        }
        return ret;
    }
}
```

time:2 beat:84

