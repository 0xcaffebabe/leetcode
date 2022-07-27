
<https://leetcode.cn/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-ii-lcof/>

```java
class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(32);
        int[] bmap = new int[10000];
        for(int i = 0; i < nums.length; i++) {
            map.putIfAbsent(nums[i], i);
            bmap[map.get(nums[i])]++;
        }
        for(int i = 0; i < nums.length; i++) {
            if (bmap[i] == 1) return nums[i];
        }
        return 0;
    }
}
```

time:11 beat:38

