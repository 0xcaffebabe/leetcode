
<https://leetcode-cn.com/problems/reverse-vowels-of-a-string/>

```java
class Solution {
    public String reverseVowels(String s) {
        int p = 0, q = s.length() - 1;
        char[] ans = new char[s.length()];
        for(int i = 0;i < s.length(); i++) ans[i] = s.charAt(i);
        while(p < q) {
            char l = ans[p];
            char r= ans[q];
            if (isVowel(l) && isVowel(r)) {
                char t = ans[q];
                ans[q] = ans[p];
                ans[p] = t;
                p++;
                q--;
                continue;
            }
            if (!isVowel(r)) q--;
            if (!isVowel(l)) p++;
        }
        StringBuilder sb = new StringBuilder();
        for(char c: ans) sb.append(c);
        return sb.toString();
    }

    private boolean isVowel(char l) {
        return l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u'
            || l == 'A' || l == 'E' || l == 'I' || l == 'O' || l == 'U';
    }
}
```

time:3 beat:79

