
<https://leetcode-cn.com/problems/jewels-and-stones/submissions/>

```java
class Solution {
    public int numJewelsInStones(String J, String S) {
        int[] map = new int[128];
        int ret = 0;
        for(int i = 0;i<J.length();i++){
            map[J.charAt(i)] = 1;
        }
        for(int i = 0;i<S.length();i++){
            if (map[S.charAt(i)] == 1) ret++;
        }
        return ret;
    }
}
```

耗时：1

