
<https://leetcode-cn.com/problems/number-of-lines-to-write-string/>

```java
class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int rows = 1;
        int currentRowUnitLeft = 100;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int val = widths[c - 97];
            if (val > currentRowUnitLeft) {
                currentRowUnitLeft = 100;
                rows++;   
            }
            currentRowUnitLeft -= val;
        }
        
        return new int[]{rows, 100 - currentRowUnitLeft};
    }
}
```

time:0 beat:100

