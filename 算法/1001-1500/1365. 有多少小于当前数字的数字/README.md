
<https://leetcode-cn.com/problems/how-many-numbers-are-smaller-than-the-current-number/>

```java
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ret = new int[nums.length];
        for(int i = 0;i < nums.length;i++){
            for(int j = 0;j < nums.length;j++){
                if (j == i) continue;
                if (nums[j] < nums[i]) ret[i]++;
            }
        }
        return ret;
    }
}
```

time:18 beat:8

