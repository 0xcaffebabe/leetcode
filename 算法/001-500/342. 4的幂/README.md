
<https://leetcode-cn.com/problems/power-of-four/>

```java
class Solution {
    public boolean isPowerOfFour(int n) {
        int cnt = 0;
        int lim = (int)Math.sqrt(n);
        while(cnt <= lim) {
            if (Math.pow(4, cnt) == n) return true;
            cnt++;
        }
        return false;
    }
}
```

time:10 beat:8

