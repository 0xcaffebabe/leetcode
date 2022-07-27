
<https://leetcode-cn.com/problems/shuffle-the-array/>

```java
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int p = 0,q = n;
        int[] ret = new int[nums.length];
        for(int i = 0;i<ret.length;i+=2){
            ret[i] = nums[p++];
            ret[i + 1] = nums[q++];
        }
        return ret;
    }
}
```

time: 0 beat: 100

