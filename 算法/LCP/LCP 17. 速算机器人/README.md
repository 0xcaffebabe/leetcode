
<https://leetcode-cn.com/problems/nGK0Fy/>

```java
class Solution {
    public int calculate(String s) {
        int x = 1, y = 0;
        int p = 0,q = 0;
        for(int i=0;i<s.length();i++){
            if (s.charAt(i) == 'A') x = 2 * x + y;
            else y = 2* y + x;
        }
        return x + y;
    }
}
```

time:0 beat: 100

