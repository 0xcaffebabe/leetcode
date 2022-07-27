
<https://leetcode-cn.com/problems/richest-customer-wealth/>

```java
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int[] a: accounts){
            int sum = 0;
            for(int i: a) sum += i;
            if (sum > max) max = sum;
        }
        return max;
    }
}
```

time:0 beat:100

