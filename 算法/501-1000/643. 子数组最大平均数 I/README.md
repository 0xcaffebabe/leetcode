
<https://leetcode-cn.com/problems/maximum-average-subarray-i/>

```java
/*
* 滑动窗口和思路：维护两个指针，每次滑动总和就减去前一个，然后加上后一个
*/
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if (nums.length <k) return -1;
        int p=0,q=k-1;
        int sum=0;
        double max=0;
        for(int i=p;i<=q;i++) sum += nums[i];
        max = (double)sum/k;
        while(q < nums.length-1){
            sum -= nums[p++];
            sum += nums[++q];
            double t = (double)sum /k;
            if (t > max) max = t;
        }
        return max;
    }
}
```

time:4 beat:68

