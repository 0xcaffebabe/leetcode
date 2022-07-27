
<https://leetcode-cn.com/problems/n-repeated-element-in-size-2n-array/>

```java
class Solution {
    public int repeatedNTimes(int[] A) {
        int[] map = new int[10001];
        for(int i : A) map[i]++;
        int n = A.length/2;
        for(int i = 0;i<map.length;i++) if (map[i] >= n) return i;
        return -1;
    }
}
```

time:2 beat: 47

