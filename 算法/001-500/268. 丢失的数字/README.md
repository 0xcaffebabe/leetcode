
<https://leetcode-cn.com/problems/missing-number/>

```java
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n * (n+1)) /2;
        for(int i : nums) sum -= i;
        return sum;
    }
}
```

time:0 beat:100

