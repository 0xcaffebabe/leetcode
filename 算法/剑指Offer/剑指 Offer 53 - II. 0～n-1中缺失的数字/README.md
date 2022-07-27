
<https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof/submissions/>

```java
class Solution {
    public int missingNumber(int[] nums) {
        int ret = nums[nums.length-1];
        for(int i=0;i<ret;i++){
            if (nums[i] != i) return i;
        }
        return ret+1;
    }
}
```

耗时：0

