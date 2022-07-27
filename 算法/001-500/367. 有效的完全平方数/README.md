
<https://leetcode-cn.com/problems/valid-perfect-square/submissions/>

- 从1扫描到num/2+1 每次递增1

```java
class Solution {
    public boolean isPerfectSquare(int num) {
        int N = num/2+1;
        for (int i=1;i<=N;i++){
            if (i*i == num){
                return true;
            }
        }
        return false;
    }
}
```

耗时:1449ms

