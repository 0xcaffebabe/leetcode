
<https://leetcode-cn.com/problems/longer-contiguous-segments-of-ones-than-zeros/>

```java
class Solution {
    public boolean checkZeroOnes(String s) {
        return getMaxSeq(s, '1') > getMaxSeq(s, '0');
    }

    private int getMaxSeq(String s, char n) {
        if (s.length() == 1) return s.charAt(0) == n ? 1 : 0;
        int p=0,q=0;
        int max = 0;
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if (c == n) q = i;
            else p = i + 1;

            if (q - p > max) max = q - p;
        }
        return max;
    }
}
```

time:1 beat:98

