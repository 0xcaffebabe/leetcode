
<https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/>

```java
class Solution {
    public String reverseWords(String s) {
        if (s.length() == 0) return "";
        StringBuffer sb = new StringBuffer();
        for(int i =s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        String[] strs = sb.toString().split(" ");
        sb = new StringBuffer();
        for(int i = strs.length-1;i>=0;i--){
            sb.append(strs[i]);
            if (i != 0) sb.append(" ");
        }
        return sb.toString();
    }
}
```

耗时：10

