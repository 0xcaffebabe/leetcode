
<https://leetcode-cn.com/problems/find-the-difference/>

```java
class Solution {
    public char findTheDifference(String s, String t) {
        int[] map = new int[128];

        for(int i =0;i<t.length();i++){
            char c = t.charAt(i);
            map[c] = map[c] + 1;
        }
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            map[c] = map[c] - 1;
        }
        for(int i=0;i<map.length;i++){
            if (map[i] != 0) return (char)i;
        }
        return (char)-1;
    }
}
```

耗时：4

