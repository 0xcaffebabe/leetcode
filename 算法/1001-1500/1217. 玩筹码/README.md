
<https://leetcode.cn/problems/minimum-cost-to-move-chips-to-the-same-position/>

```java
class Solution {
    public int minCostToMoveChips(int[] position) {
        int even = 0, odd = 0;
        for(int i: position) {
            if (i % 2 == 0) even++;
            else odd++;
        }
        return Math.min(even, odd);
    }
}
```

time:0 beat:100

