
<https://leetcode-cn.com/problems/product-of-array-except-self/submissions/>

```java
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] lMap = new int[nums.length];
        int[] rMap = new int[nums.length];
        int lAll = 1;
        int rAll = 1;
        for(int i = 0;i<nums.length;i++){
            lMap[i] = lAll;
            lAll *= nums[i];
        }
        for(int i = nums.length - 1;i>=0;i--){
            rMap[i] = rAll;
            rAll *= nums[i];
        }
        for(int i = 0;i<nums.length;i++){
            lMap[i] *= rMap[i];
        }
        return lMap;

    }
}
```

耗时：1

