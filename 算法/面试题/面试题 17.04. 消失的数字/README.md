
<https://leetcode-cn.com/problems/missing-number-lcci/>

```java
class Solution {
    public int missingNumber(int[] nums) {
        if (nums.length < 1) return 0;
        
        boolean[] map = new boolean[nums.length + 1];
        for(int i : nums) map[i] = true;
        for(int i = 0; i< map.length;i++) {
            if (!map[i]) return i;
        }
        return -1;
    }
}
```

time:1 beat:40

