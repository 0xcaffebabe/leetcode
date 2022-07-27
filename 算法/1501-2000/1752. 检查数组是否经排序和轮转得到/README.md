
<https://leetcode-cn.com/problems/check-if-array-is-sorted-and-rotated/>

```java
class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        for(int i = 1; i <= n ; i++) {
            int p = nums[(i - 1 ) % n];
            int c = nums[i % n];
            if (p > c) count++;
        }
        return count <= 1;
    }
}
```

time:0 beat:100

