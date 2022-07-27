
<https://leetcode-cn.com/problems/robot-return-to-origin/>

```java
class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for(int i = 0;i < moves.length(); i++) {
            char c = moves.charAt(i);
            if (c == 'U') y++;
            if (c == 'D') y--;
            if (c == 'L') x--;
            if (c == 'R') x++;
        }
        return x == 0 && y == 0;
    }
}
```

time:7 beat:41

