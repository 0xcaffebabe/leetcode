
<https://leetcode-cn.com/problems/power-of-two/>

```java
class Solution {
    public boolean isPowerOfTwo(int n) {
        int k = 1;
        while (true){
            if (n == k) return true;
            if (k > n) return false;
            if (k < 0) break;
            k <<= 1;
        }
        return false;
    }
}
```

耗时：1

