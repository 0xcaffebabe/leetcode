
<https://leetcode-cn.com/problems/hamming-distance/submissions/>

```java
class Solution {
    public int hammingDistance(int x, int y) {
        // 异或：相同为0 不同为1
        int z = x^y;
        int ret = 0;
        // 计算二进制有多少1
        while(z!=0){
            int t = z%2;
            z/=2;
            if (t == 1){
                ret++;
            }
        }
        return ret;
    }
}
```

耗时：0

