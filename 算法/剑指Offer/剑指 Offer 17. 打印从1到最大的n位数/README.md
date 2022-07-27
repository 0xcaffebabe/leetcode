
<https://leetcode-cn.com/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof/>

```java
class Solution {
    public int[] printNumbers(int n) {
        if (n == 0) return new int[]{};
        int[] ret = new int[(int)Math.pow(10,n)-1];
        for(int i=0;i<ret.length;i++){
            ret[i]=i+1;
        }
        return ret;
    }
}
```

耗时：1

