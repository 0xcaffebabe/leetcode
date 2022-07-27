
<https://leetcode-cn.com/problems/contains-duplicate/>

```java
class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length <= 1) return false;
        
        Set<Integer> set = new HashSet<>(nums.length);
        for(int i: nums) set.add(i);
        return set.size() != nums.length;
```

耗时：6

