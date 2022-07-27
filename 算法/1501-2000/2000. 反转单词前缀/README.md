
<https://leetcode-cn.com/problems/reverse-prefix-of-word/>

```java
class Solution {
    public String reversePrefix(String word, char ch) {
        int index = -1;
        for(int i = 0;i<word.length();i++){
            if (word.charAt(i) == ch) {
                index = i;
                break;
            }
        }
        if (index == -1) return word;
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<word.length();i++){
            if (i <= index) sb.append(word.charAt(index - i));
            else sb.append(word.charAt(i));
        }
        return sb.toString();
    }
}
```

time:0 beat:100

