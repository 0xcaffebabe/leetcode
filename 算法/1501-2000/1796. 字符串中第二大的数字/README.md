
<https://leetcode-cn.com/problems/second-largest-digit-in-a-string/>

```java
class Solution {
    public int secondHighest(String s) {
        int max = -1;
        int secondMax = -1;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 48 && c <= 57) {
                int v = c - 48;
                if (v >= max) max = v;
            }
        }
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 48 && c <= 57) {
                int v = c - 48;
                if (v >= secondMax && v < max) secondMax = v;
            }
        }
        return secondMax;
    }
}
```

time:2 beat:37

