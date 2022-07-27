
<https://leetcode-cn.com/problems/maximum-number-of-words-found-in-sentences/>

```java
class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String s :sentences) {
            int cmax = 1;
            for(int i = 0;i<s.length();i++) if (s.charAt(i) == ' ') cmax++;
            if (cmax > max) max = cmax;
        }
        return max;
    }
}
```

time:3 beat:68

