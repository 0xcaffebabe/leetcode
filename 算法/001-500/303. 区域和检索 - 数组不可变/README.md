
<https://leetcode-cn.com/problems/range-sum-query-immutable/>

```java
class NumArray {

    private int[] nums;
    private int[] cache;

    public NumArray(int[] nums) {
        this.nums = nums;
        cache = new int[nums.length];
        int total = 0;
        for(int i = 0;i<nums.length;i++){
            total += nums[i];
            cache[i] = total;
        }
    }
    
    public int sumRange(int i, int j) {
        if (j == 0 && i == 0) return cache[0];
        if (i == 0) return cache[j];
        return cache[j] - cache[i-1];
    }
}
```

耗时：10

