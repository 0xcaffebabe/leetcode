
<https://leetcode-cn.com/problems/check-if-two-string-arrays-are-equivalent/>

```java
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = Arrays.stream(word1)
                    .collect(Collectors.joining());
        String s2 = Arrays.stream(word2)
                    .collect(Collectors.joining());
        return s1.equals(s2);
    }
}
```

time:3 beat:11

