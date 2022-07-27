
<https://leetcode-cn.com/problems/to-lower-case/>

```java
class Solution {
    public String toLowerCase(String str) {
        StringBuffer sb = new StringBuffer();
        for(int i =0;i<str.length();i++){
            char c = str.charAt(i);
            if (c >= 65 && c <=90) c = (char)(c+32);
            sb.append(c);
        }
        return sb.toString();
    }
}
```

耗时：0

