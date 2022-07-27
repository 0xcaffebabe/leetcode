
<https://leetcode-cn.com/problems/create-target-array-in-the-given-order/>

```java
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        if (index.length <= 1) return nums;
        LinkedList<Integer> target = new LinkedList<>();
        for(int i = 0;i<index.length;i++) target.add(index[i], nums[i]);

        int[] ret = new int[nums.length];
        for(int i = 0;i<index.length;i++) ret[i]=target.get(i);
        return ret;
    }
}
```

耗时：2

