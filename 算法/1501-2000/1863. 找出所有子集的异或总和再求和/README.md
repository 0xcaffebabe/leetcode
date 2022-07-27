
<https://leetcode.cn/problems/sum-of-all-subset-xor-totals/>

```java
class Solution {
    private List<List<Integer>> subsets = new ArrayList<>(16);
    private int[] nums;
    public int subsetXORSum(int[] nums) {
        this.nums = nums;
        recursive(new ArrayList<>(), 0);
        int ans = 0;
        for(var list: subsets) {
            int sum = list.get(0);
            for(int i = 1; i < list.size(); i++) sum ^= list.get(i);
            ans += sum;
        }
        return ans;
    }

    private void recursive(List<Integer> origin, int start) {
        if (origin.size() == nums.length) return;
        for(int i = start; i < nums.length; i++) {
            var list = new ArrayList<Integer>();
            for(int o: origin) list.add(o);
            
            list.add(nums[i]);
            subsets.add(list);
            recursive(list, i + 1);
        }
    }
}
```

time: 15 beat:6

