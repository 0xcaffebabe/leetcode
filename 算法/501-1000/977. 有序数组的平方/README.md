
<https://leetcode-cn.com/problems/squares-of-a-sorted-array/>

```java
class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i] = nums[i] * nums[i];
        }
        int p=0,q=nums.length - 1;
        int[] ret = new int[nums.length];
        for(int i = nums.length - 1; i>=0;i--){
            if (nums[p] > nums[q]){
                ret[i] = nums[p++];
            }else if (nums[p] <= nums[q]) {
                ret[i] = nums[q--];
            }
        }
        return ret;
    }
}
```

time:1 beat:100

