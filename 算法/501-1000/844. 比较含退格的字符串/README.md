
<https://leetcode-cn.com/problems/backspace-string-compare/>

```java
class Solution {
    public boolean backspaceCompare(String S, String T) {
        LinkedList<Character> s1 = new LinkedList<>();
        LinkedList<Character> s2 = new LinkedList<>();
        for(int i = 0;i<S.length();i++){
            char c = S.charAt(i);
            if (c == '#' && !s1.isEmpty()) s1.pop();
            else if(c != '#') s1.push(c);
        }
        for(int i = 0;i<T.length();i++){
            char c = T.charAt(i);
            if (c == '#' && !s2.isEmpty()) s2.pop();
            else if(c != '#') s2.push(c);
        }
        if (s1.size() != s2.size()) return false;
        while(!s1.isEmpty() && !s2.isEmpty()){
            if (s1.pop() != s2.pop()) return false;
        }
        return true;
    }
}
```

耗时：2

