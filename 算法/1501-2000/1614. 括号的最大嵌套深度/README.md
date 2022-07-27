
<https://leetcode-cn.com/problems/maximum-nesting-depth-of-the-parentheses/>

```java
class Solution {
    public int maxDepth(String s) {
        int max = 0;
        int cur = 0;
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if (c == '('){
                cur++;
                if (cur > max) max = cur;
            }else if (c == ')'){
                cur--;
            }
        }
        return max;
    }
}
```

time:0 beat:100

