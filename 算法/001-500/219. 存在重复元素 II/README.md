
<https://leetcode-cn.com/problems/contains-duplicate-ii/>

```java
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k == 0) return false;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if (map.containsKey(nums[i])) {
                if (Math.abs(map.get(nums[i]) - i) <= k) return true;
                else map.put(nums[i], i);
            }else {
                map.put(nums[i], i);
            }
        }
        return false;
    }
}
```

time:17 beat:40

