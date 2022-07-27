
<https://leetcode-cn.com/problems/count-number-of-pairs-with-absolute-difference-k/>

```java
class Solution {
    public int countKDifference(int[] nums, int k) {
        int cnt = 0;
        for(int i = 0;i<nums.length;i++) {
            for(int j = 0;j<nums.length;j++) if (i < j && Math.abs(nums[i] - nums[j]) == k) cnt++;
        }
        return cnt;
    }
}
```

time:9 beat:6

