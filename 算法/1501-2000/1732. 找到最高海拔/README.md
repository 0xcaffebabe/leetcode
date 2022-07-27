
<https://leetcode.cn/problems/find-the-highest-altitude/>

```java
class Solution {
    public int largestAltitude(int[] gain) {
        int max = Integer.MIN_VALUE;
        int cur = 0;
        for(int i: gain) {
            if (cur > max) max = cur;
            cur += i;
        }
        if (cur > max) max = cur;
        return max;
    }
}
```

time:0 beat:100

