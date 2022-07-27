
<https://leetcode-cn.com/problems/maximum-product-of-two-elements-in-an-array/>

```java

class Solution {
    public int maxProduct(int[] nums) {
        int max = -1;
        int second = -1;
        int maxIndex = 0;
        int secondIndex = 1;
        for(int i =0;i<nums.length;i++){
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }
        for(int i =0;i<nums.length;i++){
            if (nums[i] > second && i != maxIndex) {
                second = nums[i];
                secondIndex = i;
            }
        }
        return (max-1) * (second - 1);
    }
}
```

time:1 beat:76

