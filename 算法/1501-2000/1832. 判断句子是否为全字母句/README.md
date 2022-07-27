
<https://leetcode-cn.com/problems/check-if-the-sentence-is-pangram/>

```java
class Solution {
    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) return false;
        boolean[] map = new boolean[26];
        for(int i = 0;i< sentence.length();i++){
            char c = sentence.charAt(i);
            map[c - 97] = true;
        }
        for(boolean i : map){
            if (!i) return false;
        }
        return true;
    }
}
```

time:2 beat:100

