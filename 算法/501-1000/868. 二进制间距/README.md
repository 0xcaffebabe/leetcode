
<https://leetcode-cn.com/problems/binary-gap/>

```java
class Solution {
    public int binaryGap(int n) {
        int cnt = 0;
        int max = 0;
        int p = -1;
        int c = 0;
        while(n > 0) {
            c = n% 2;
            if (c == 1) {
                if (cnt > max && p != -1) max = cnt;
                p = 1;
                cnt = 1;
            }else {
                cnt++;
            }
            n /=2;
        }
        return max;
    }
}
```

time:0 beat:100

