
<https://leetcode-cn.com/problems/remove-all-adjacent-duplicates-in-string/>

```java
class Solution {
    public String removeDuplicates(String S) {
        LinkedList<Character> s = new LinkedList<>();
        for(int i = 0;i<S.length();i++){
            if (s.peek() == null) {
                s.push(S.charAt(i));
                continue;
            }
            if (S.charAt(i) == s.peek()) s.pop();
            else s.push(S.charAt(i));
        }
        char[] ca = new char[s.size()];
        for(int i = s.size() - 1;i>=0;i--) ca[i] = s.pop();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<ca.length;i++) sb.append(ca[i]);
        return sb.toString();
    }
}
```

time: 16 beat: 72

