
<https://leetcode-cn.com/problems/license-key-formatting/>

```java
class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s = replaceAllDash(s);
        if (s.length() < k) return s;
        int first = s.length() % k;
        StringBuilder sb = new StringBuilder();
        if (first != 0) {
            for(int i = 0;i<first;i++) sb.append(s.charAt(i));
            sb.append("-");
        }
        for(int i = first;i<s.length();i+=k) {
            for(int j =i;j <k+i;j++) {
                sb.append(s.charAt(j));
            }
            if (i < s.length()-k) sb.append("-");
        }
        return sb.toString();
    }

    private String replaceAllDash(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0;i<s.length();i++) {
            char c = s.charAt(i);
            if (c == '-') continue;
            sb.append(c);
        }
        return sb.toString().toUpperCase();
    }
}
```

time:14 beat:44

