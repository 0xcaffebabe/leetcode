
<https://leetcode-cn.com/problems/maximum-ice-cream-bars/>

```java
class Solution {
    public int maxIceCream(int[] costs, int coins) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.comparingInt(o -> o));
        for (int i : costs) {
            q.offer(i);
        }
        int cnt = 0;
        while(coins > 0) {
            Integer i = q.poll();
            if (i == null) return cnt;
            if (i > coins) return cnt;
            cnt++;
            coins -= i;
        }
        return cnt;
    }
}
```

time: 60+ beat: 5

