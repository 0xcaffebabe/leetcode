
<https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/>

```java
class Solution {
    public int findRepeatNumber(int[] nums) {
        int[] map = new int[nums.length];
        for(int i:nums){
            map[i] = map[i] + 1;
        }
        for(int i=0;i<map.length;i++){
            if (map[i]>1){
                return i;
            }
        }
        return -1;
    }
}
```

耗时：1

