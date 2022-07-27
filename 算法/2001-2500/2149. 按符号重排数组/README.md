
<https://leetcode.cn/problems/rearrange-array-elements-by-sign/>

```java
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int p = 0, q = 0;
        int[] result = new int[nums.length];
        int pos = 0;
        while(pos < result.length) {
            while(nums[p] < 0) p++;
            while(nums[q] > 0) q++;
            result[pos++] = nums[p++];
            result[pos++] = nums[q++];
        }
        return result;
    }
}
```

time:7 beat: 38

