
<https://leetcode-cn.com/problems/shuffle-an-array/>

```java
class Solution {
    private int[] origin;
    private int[] nums;
    public Solution(int[] nums) {
        origin = new int[nums.length];
        for(int i = 0; i < nums.length; i++) origin[i] = nums[i];
        this.nums = nums;
    }
    
    public int[] reset() {
        for(int i = 0; i < nums.length; i++) nums[i] = origin[i];
        return origin;
    }
    
    public int[] shuffle() {
        Random rnd = new Random();
        for(int i = 0; i < nums.length; i++) {
            int index = rnd.nextInt(i, nums.length);
            int t = nums[i];
            nums[i] = nums[index];
            nums[index] = t;
        }
        return nums;
    }
}
```

time:46 beat:99

