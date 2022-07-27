
<https://leetcode-cn.com/problems/determine-if-string-halves-are-alike/>

```java
class Solution {
    public boolean halvesAreAlike(String s) {
        int[] map = new int[128];
        map['a'] = 1;
        map['e'] = 1;
        map['i'] = 1;
        map['o'] = 1;
        map['u'] = 1;
        map['A'] = 1;
        map['E'] = 1;
        map['I'] = 1;
        map['O'] = 1;
        map['U'] = 1;
        int front = 0;
        int back = 0;
        int n = s.length()/2;
        for(int i = 0;i<n;i++) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(i + n);
            if (map[c1] == 1) front++;
            if (map[c2] == 1) back++;
        }
        return front == back;
    }
}
```

time:2 beat:95


