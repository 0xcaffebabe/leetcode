
输入：nums = [1,2,3,4]
输出：[1,3,6,10]
解释：动态和计算过程为 [1, 1+2, 1+2+3, 1+2+3+4] 。

<https://leetcode-cn.com/problems/running-sum-of-1d-array/>

- 解法

求出nums的和，设置ret的最后一个元素为sum

遍历ret数组倒数第二个至第一个，ret元素内容为后一个下标元素-nums对应的数

```java
class Solution {
    public int[] runningSum(int[] nums) {
        if (nums.length == 0) {
            return new int[]{};
        }
        int[] ret = new int[nums.length];
        int sum = 0;
        for (int i:nums){
            sum+=i;
        }
        ret[ret.length-1]=sum;
        for(int i=nums.length-2;i>=0;i--){
            ret[i] = ret[i+1]-nums[i+1];
        }
        return ret;
    }
}
```

