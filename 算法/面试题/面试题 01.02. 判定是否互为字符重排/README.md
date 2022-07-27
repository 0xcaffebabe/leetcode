
<https://leetcode-cn.com/problems/check-permutation-lcci/>

```java
class Solution {
    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int[] map = new int[128];
        for(int i = 0;i<s1.length();i++) {
            map[s1.charAt(i)]++;
            map[s2.charAt(i)]--;
        }
        for(int i : map){
            if (i != 0) return false;
        }
        return true;
```

耗时：0

