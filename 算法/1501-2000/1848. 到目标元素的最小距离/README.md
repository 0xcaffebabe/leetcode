
<https://leetcode-cn.com/problems/minimum-distance-to-the-target-element/>

```java
class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int min = -1;
        int minVal = 0;
        int tmp = 0;
        for(int i = 0;i<nums.length;i++) {
            if (nums[i] == target) {
                tmp = Math.abs(i - start);
                if (min == -1) {
                    min = i;
                    minVal = tmp;
                    continue;
                }
                if (tmp < minVal) {
                    min = i;
                    minVal = tmp;
                }
            }
        }
        return minVal;
    }
}
```

time: 1 beat:62

