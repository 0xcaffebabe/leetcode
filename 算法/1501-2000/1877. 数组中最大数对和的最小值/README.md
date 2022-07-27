
<https://leetcode-cn.com/problems/minimize-maximum-pair-sum-in-array/>

```java
class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        int n = nums.length;
        int t = 0;
        for(int i=0;i<n;i++) {
            t = nums[i] + nums[n - i - 1];
            if (t > ans) ans = t;
        }
        return ans;
    }
}
```

time: 57 beat:98

