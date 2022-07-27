
<https://leetcode-cn.com/problems/sort-array-by-parity/>

```java
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if (nums.length == 1) return nums;
        int p = 0, q = nums.length - 1;
        int[] ret = new int[nums.length];
        for(int i : nums){
            if (i % 2 == 0) ret[p++] = i;
            else ret[q--] = i;
        }
        return ret;
    }
}
```

time:1 beat:100

