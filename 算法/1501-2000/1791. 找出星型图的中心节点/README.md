
<https://leetcode-cn.com/problems/find-center-of-star-graph/>

```java
class Solution {
    public int findCenter(int[][] edges) {
        int[] map = new int[100001];
        for(int [] i: edges) {
            map[i[0]]++;
            map[i[1]]++;
        }
        for(int i = 0;i<map.length;i++) if (map[i] == edges.length) return i;
        return -1;
    }
}
```

time:3 beat:21

