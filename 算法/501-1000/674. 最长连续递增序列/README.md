
<https://leetcode-cn.com/problems/longest-continuous-increasing-subsequence/>

```java
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length <= 1) return nums.length;
        int max = 0;
        int seq = 1;
        for(int i = 1;i<nums.length;i++){
            if (nums[i] > nums[i-1]) seq++;
            else seq = 1;
            if (seq > max) max = seq;
        }
        return max;
    }
}
```

耗时：0

