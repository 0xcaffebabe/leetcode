
<https://leetcode-cn.com/problems/isomorphic-strings/>

```java
class Solution {
    public boolean isIsomorphic(String s, String t) {
       Map<Character,Character> m1 = new HashMap<>();
       Map<Character,Character> m2 = new HashMap<>();
       for(int i=0;i<s.length();i++){
           char c1 = s.charAt(i);
           char c2 = t.charAt(i);
           m1.putIfAbsent(c1,c2);
           m2.putIfAbsent(c2,c1); 
       }
       if (m1.size() != m2.size()) return false;
       for(int i=0;i<s.length();i++){
           char c1 = s.charAt(i);
           char c2 = t.charAt(i);
           if (c2 != m1.get(c1)) return false;
           if (c1 != m2.get(c2)) return false;
       }
        return true;
    }
}
```

耗时：15

