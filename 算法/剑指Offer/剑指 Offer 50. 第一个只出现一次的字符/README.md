
<https://leetcode-cn.com/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/>

```java
class Solution {
    public char firstUniqChar(String s) {
        int[] map = new int[128];
        for(char c : s.toCharArray()){
            map[c] = map[c] + 1;
        }
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (map[c] == 1){
                return c;
            }
        }
        return ' ';
    }
}
```

耗时：6

