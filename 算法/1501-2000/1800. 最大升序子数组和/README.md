
<https://leetcode-cn.com/problems/maximum-ascending-subarray-sum/>

```java
class Solution {
    public int maxAscendingSum(int[] nums) {
        if (nums.length == 1) return nums[0];
        int max = 0;
        int sum = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            int c = nums[i];
            int n = nums[i + 1];
            if (sum == 0) sum += c;

            if (n > c) sum+= n;

            if (sum > max) max = sum;
            if (n <= c) sum = 0;
        }
        return max;
    }
}
```

time:0 beat:100

