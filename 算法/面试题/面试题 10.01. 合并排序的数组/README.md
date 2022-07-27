
<https://leetcode-cn.com/problems/sorted-merge-lcci/>

```java
class Solution {
    public void merge(int[] A, int m, int[] B, int n) {
        int[] ret = new int[m + n];
        int p=0, q=0, pos = 0;
        while(pos < ret.length){
            if (p >= m) {
                ret[pos++]=B[q++];
                continue;
            }
            if (q >= n) {
                ret[pos++]=A[p++];
                continue;
            }
            if (A[p] < B[q]) ret[pos++] = A[p++];
            else ret[pos++] = B[q++];
            
        }
        for(int i=0;i<A.length;i++) A[i] = ret[i];
    }
}
```

耗时：0

