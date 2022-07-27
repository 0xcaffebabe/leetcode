
<https://leetcode-cn.com/problems/unique-morse-code-words/>

```java
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] map = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
        ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-",
        "...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        for(String s : words){
            StringBuffer sb = new StringBuffer();
            for(int i = 0;i<s.length();i++){
                sb.append(map[s.charAt(i) - 97]);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
```

耗时：2

