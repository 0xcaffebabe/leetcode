
<https://leetcode-cn.com/problems/single-number/>

使用异或去除相同数字

```java
class Solution {
    public int singleNumber(int[] nums) {
        int base = nums[0];
        for(int i=1;i<nums.length;i++){
            base = base^nums[i];
        }
        return base;
    }
}
```

耗时:1ms

