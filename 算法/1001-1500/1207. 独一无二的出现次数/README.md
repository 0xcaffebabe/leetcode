
<https://leetcode-cn.com/problems/unique-number-of-occurrences/>

```java
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] map1 = new int[2002];
        for(int i : arr) map1[i+1000]++;
        int[] map2 = new int[1001];
        for(int i: map1) if (i >= 1) map2[i]++;

        for(int i : map2) if (i > 1) return false;
        return true;
    }
}
```

time:1 beat:99

