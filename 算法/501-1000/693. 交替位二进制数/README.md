
<https://leetcode-cn.com/problems/binary-number-with-alternating-bits/>

```java
class Solution {
    public boolean hasAlternatingBits(int n) {
        int p = -1;
        int c = -1;
        while(n > 0) {
            c = n% 2;
            if (p != -1) {
                if (p == c) return false;
            }
            p  = c;
            n /=2;
        }
        return true;
    }
}
```

time:0 beat:100

