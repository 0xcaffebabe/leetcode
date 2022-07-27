
<https://leetcode-cn.com/problems/number-of-segments-in-a-string/>

```java
class Solution {
    public int countSegments(String s) {
        int p = 0;
        int ans = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ' && p != 0) {
                p = 0;
                ans++;
            }
            if (c != ' ') p++;
        }
        if (p != 0) ans++;
        return ans;
    }
}
```

time:0 beat:100

