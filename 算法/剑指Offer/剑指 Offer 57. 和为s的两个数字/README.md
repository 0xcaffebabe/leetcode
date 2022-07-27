
<https://leetcode-cn.com/problems/he-wei-sde-liang-ge-shu-zi-lcof/>

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int p = 0,q = nums.length - 1;
        while(p < q){
            int r = nums[p] + nums[q];
            if (target == r) return new int[]{nums[p],nums[q]};
            if (r < target) p++;
            else q--;
        }
        return new int[]{};
    }
}
```

time:2 beat:95

