
<https://leetcode-cn.com/problems/find-smallest-letter-greater-than-target/>

```java
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(int i = 0;i<letters.length;i++){
            if (letters[i] > target) return letters[i];
        }
        return letters[0];
    }
}
```

耗时：0

