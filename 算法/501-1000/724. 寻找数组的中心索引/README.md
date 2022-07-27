
<https://leetcode-cn.com/problems/find-pivot-index/>

<https://leetcode-cn.com/problems/tvdfij/>

- 解法1

```java
class Solution {
    public int pivotIndex(int[] nums) {
        if (nums.length == 0) return -1;
        if (nums.length == 1) return 0;
        int[] l = new int[nums.length];
        l[0] = nums[0];
        int[] r = new int[nums.length];
        r[nums.length - 1] = nums[nums.length - 1];

        for(int i = 1;i<nums.length;i++) l[i] = nums[i] + l[i-1];
        for(int i = nums.length -2;i>=0;i--) r[i] = nums[i] + r[i+1];

        for(int i = 0;i<l.length;i++){
            if (l[i] == r[i]) return i;
        }
        return -1;
    }
}
```

耗时：2

- 解法2

```java
class Solution {
    public int pivotIndex(int[] nums) {
        int rsum = 0;
        int lsum = 0;
        for(int i : nums) rsum += i;
        for(int i = 0;i < nums.length;i++) {
            rsum -= nums[i];
            if (lsum == rsum) return i;
            lsum += nums[i];
        }
        return -1;
    }
}
```

time:1 beat:87

