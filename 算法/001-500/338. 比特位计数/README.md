
<https://leetcode-cn.com/problems/counting-bits/>

```java
class Solution {
    public int[] countBits(int num) {
        int[] ret = new int[num+1];
        for(int i=0;i<=num;i++){
            int k = i;
            while(k > 0) {
                ret[i]+=k%2;
                k/=2;
            }
        }
        return ret;
    }
}
```

耗时：12

