
<https://leetcode-cn.com/problems/largest-number-at-least-twice-of-others/>

```java
class Solution {
    public int dominantIndex(int[] nums) {
        int maxIndex = 0;
        for(int i = 0;i<nums.length;i++){
            if (nums[i] > nums[maxIndex]) maxIndex = i;
        }
        for(int i = 0;i<nums.length;i++){
            if (nums[i] * 2 > nums[maxIndex] && i != maxIndex) return -1;
        }
        return maxIndex;
    }
}
```

耗时：0

