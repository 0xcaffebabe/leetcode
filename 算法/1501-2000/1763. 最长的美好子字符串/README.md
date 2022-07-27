
<https://leetcode-cn.com/problems/longest-nice-substring/>

```java
class Solution {
    public String longestNiceSubstring(String s) {
        
        String result = "";
        for(int i = 0;i<s.length()-1;i++){
            for(int j = i+1;j<=s.length();j++) {
                String c = s.substring(i, j);
                if (check(c) && c.length() > result.length()) {
                    result = c;
                }
            }
        }
        return result;
    }

    private boolean check(String s) {
        if (s.length() <=1) return false;
        int[] lowerMap = new int[128];
        int[] upperMap = new int[128];

        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if (c >=97 ) lowerMap[c]++;
            if (c <= 90) upperMap[c+32]++;
        }
        for(int i = 0;i<128;i++){
            if ((lowerMap[i] == 0 && upperMap[i] != 0) || (upperMap[i] == 0 && lowerMap[i] != 0)) return false;
        }
        return true;
    }
}
```

time:35 beat:32

