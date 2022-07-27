
<https://leetcode-cn.com/problems/check-if-all-1s-are-at-least-length-k-places-away/>

```java
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int previous = -1;
        for(int i = 0;i < nums.length; i++) {
            if (nums[i] == 1 && previous == -1) {
                previous = i;
                continue;
            }
            if (nums[i] == 1 && i - previous - 1 < k) return false;
            if (nums[i] == 1) previous = i;
        }
        return true;
    }
}
```

time:2 beat:11

