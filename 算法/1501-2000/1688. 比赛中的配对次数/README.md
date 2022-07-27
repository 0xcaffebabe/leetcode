
<https://leetcode-cn.com/problems/count-of-matches-in-tournament/>

```java
class Solution {
    public int numberOfMatches(int n) {
        int cnt = 0;
        while(n > 1) {
            if (n % 2 == 0) {
                cnt += n/2;
                n = n/2;
                continue;
            }
            if (n % 2 == 1) {
                cnt += (n-1) / 2;
                n = n - ((n-1) / 2);
            }
        }
        return cnt;
    }
}
```

time: 0 beat:100

