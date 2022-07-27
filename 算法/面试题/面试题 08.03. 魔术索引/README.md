
<https://leetcode-cn.com/problems/magic-index-lcci/submissions/>

```java
class Solution {
    public int findMagicIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if (nums[i] == i){
                return nums[i];
            }
        }
        return -1;
    }
}
```

耗时:1

