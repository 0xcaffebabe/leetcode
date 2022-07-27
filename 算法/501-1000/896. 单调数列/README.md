
<https://leetcode-cn.com/problems/monotonic-array/>

```java
class Solution {
    public boolean isMonotonic(int[] A) {
        if (A.length == 1) return true;
        boolean lastIncr = false;
        boolean lastDecr = false;
        for(int i = 1;i<A.length;i++){
            int q = A[i] - A[i - 1];
            if (q > 0) { // 递增
                if (lastDecr) return false;
                lastIncr = true;
            }else if (q < 0) { // 递减
                if (lastIncr) return false;
                lastDecr = true;
            }
        }
        return true;
    }
}
```

time: 1 beat: 100

