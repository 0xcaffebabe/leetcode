
<https://leetcode-cn.com/problems/teemo-attacking/>

```java
class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int ans = 0;
        int N = timeSeries.length - 1;
        for(int i = 0; i < N; i ++) {
            int n = timeSeries[i + 1];
            int c = timeSeries[i];
            if (n - c > duration) ans += duration;
            else ans += n-c;
        }
        ans += duration;
        return ans;
    }
}
```

time:1 beat:100

