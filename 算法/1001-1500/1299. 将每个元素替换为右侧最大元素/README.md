
<https://leetcode-cn.com/problems/replace-elements-with-greatest-element-on-right-side/>

```java
class Solution {
    public int[] replaceElements(int[] arr) {
        PriorityQueue<Integer> q = new PriorityQueue<>((Comparator<Integer>) (o1, o2) -> o2-o1);
        int[] ret = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            if (q.peek() == null) {
                ret[i]=-1;
            }else{
                ret[i]=q.peek();
            }
            q.offer(arr[i]);
        }
        return ret;
    }
}
```

耗时：10

