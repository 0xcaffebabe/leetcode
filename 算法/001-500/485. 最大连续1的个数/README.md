
<https://leetcode-cn.com/problems/max-consecutive-ones/>

```java
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0;
        int max = 0;
        for(int i : nums) {
            if (cnt >= max) max = cnt;
            if (i == 0) cnt = 0;
            else cnt++;
            if (cnt >= max) max = cnt;
        }
        return max;
    }
}
```

time:2 beat: 90

