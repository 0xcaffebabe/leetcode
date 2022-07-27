
<https://leetcode-cn.com/problems/reverse-only-letters/>

```java
class Solution {
    public String reverseOnlyLetters(String S) {
        char[] strs = new char[S.length()];
        int p = 0;
        for(int i=0;i<S.length();i++){
            char c = S.charAt(i);
            if ((c >= 97 && c <=122) || (c >= 65 && c <= 90)) {
                strs[p++] = c;
            }
        }
        StringBuilder sb = new StringBuilder(S.length());
        for(int i=0;i<S.length();i++){
            char c = S.charAt(i);
            if ((c >= 97 && c <=122) || (c >= 65 && c <= 90)) {
                sb.append(strs[--p]);
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
```

耗时：1


