
<https://leetcode-cn.com/problems/sorting-the-sentence/>

```java
class Solution {
    public String sortSentence(String s) {
        String[] a = s.split(" ");
        String[] ret = new String[a.length];
        for(String str : a){
            int index = Integer.parseInt(str.charAt(str.length() - 1) + "");
            ret[index - 1] = str.substring(0, str.length() - 1);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<ret.length;i++){
            sb.append(ret[i]);
            if (i != ret.length - 1) sb.append(" ");
        }
        return sb.toString();
    }
}
```

time:4 beat:28

