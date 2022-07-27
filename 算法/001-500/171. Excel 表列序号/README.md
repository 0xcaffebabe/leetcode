
<https://leetcode-cn.com/problems/excel-sheet-column-number/submissions/>

```java
class Solution {
    public int titleToNumber(String s) {
        int ret = 0;
        int N = s.length();
        for(int i=0;i<N;i++){
            char c = s.charAt(i);
            int val = c-64;
            double t =Math.pow(26,N-i-1);
            ret+=val*t;
        }
        return ret;
    }
}
```

耗时：2

