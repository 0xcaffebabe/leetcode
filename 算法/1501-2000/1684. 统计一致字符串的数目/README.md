
<https://leetcode-cn.com/problems/count-the-number-of-consistent-strings/>

```java
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] map = new boolean[128];
        for(int i = 0;i<allowed.length();i++){
            map[allowed.charAt(i)] = true;
        }
        int cnt = 0;
        for(String str : words){
            boolean flag = true;
            for(int i =0;i<str.length();i++){
                if (!map[str.charAt(i)]) {
                    flag = false;
                    break;
                }
            }
            if (flag) cnt++;
        }
        return cnt;

    }
}
```

time:8 beat:74

