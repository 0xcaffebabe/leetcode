
<https://leetcode-cn.com/problems/find-all-numbers-disappeared-in-an-array/>

- 解法1：使用bitmap存储数字是否出现 这个方法使用了额外的存储空间

```java
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        if (nums.length <=1) return List.of();
        int[] map = new int[nums.length + 1];
        for(int i : nums){
            map[i] = 1;
        }
        List<Integer> ret = new ArrayList<>();
        for(int i = 1;i<map.length;i++){
            if (map[i] == 0 ) ret.add(i);
        }
        return ret;
    }
}
```

time: 4 beat: 98

