
<https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/>

```java
class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> o1 - o2);
        for(int i:arr) queue.offer(i);
        int[] ret = new int[k];
        for(int i=0;i<k;i++) ret[i]=queue.poll();
        return ret;
    }
}
```

time: 20 beat:31

