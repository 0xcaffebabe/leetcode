
<https://leetcode-cn.com/problems/word-pattern/>

```java
class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> map1 = new HashMap<>();
        Map<String,Character> map2 = new HashMap<>();
        String[] strs = s.split(" ");
        if (strs.length != pattern.length()) return false;

        for(int i = 0;i<pattern.length();i++){
            char c = pattern.charAt(i);

            if (!map1.containsKey(c)) {
                map1.put(c, strs[i]);
            }
            if (!map2.containsKey(strs[i])) {
                map2.put(strs[i],pattern.charAt(i));
            }
        }
        for(int i = 0;i<pattern.length();i++){
            String s1 = map1.get(pattern.charAt(i));
            Character c = map2.get(s1);
            if (!s1.equals(strs[i])) return false;
            if (c == null) return false;
            if (c.charValue() != pattern.charAt(i)) return false;
        }
        return true;
    }
}
```

耗时：1

