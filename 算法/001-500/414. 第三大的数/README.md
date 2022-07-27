
<https://leetcode-cn.com/problems/third-maximum-number/>

```java
class Solution {
    public int thirdMax(int[] nums) {
        if (nums.length < 2) return nums[0];
        int[] cn = new int[]{0, -1, -1};

        for(int i = 0;i < nums.length; i++) {
            if (nums[cn[0]] < nums[i]) cn[0] = i;
        }
        for(int i = 0;i < nums.length; i++) {
            if (cn[1] == -1) {
                if (nums[i] < nums[cn[0]]) cn[1] = i;
                continue;
            }
            if (nums[cn[1]] < nums[i] && nums[i] < nums[cn[0]]) cn[1] = i;
        }
        for(int i = 0;i < nums.length; i++) {
            if (cn[2] == -1 && cn[1] != -1) {
                if (nums[i] < nums[cn[1]] && nums[i] < nums[cn[0]]) cn[2] = i;
                continue;
            }
            if (cn[1] != -1 && nums[cn[2]] < nums[i] && nums[i] < nums[cn[1]] && nums[i] < nums[cn[0]]) cn[2] = i;
        }
        if (cn[2] != -1) return nums[cn[2]];
        return nums[cn[0]];
    }
}
```

time:1 beat:86

