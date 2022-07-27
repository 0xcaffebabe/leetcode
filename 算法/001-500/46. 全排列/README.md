
<https://leetcode.cn/problems/permutations/>

```java
class Solution {
    private List<List<Integer>> ans = new ArrayList<>(16);
    private int[] nums;
    public List<List<Integer>> permute(int[] nums) {
        this.nums = nums;
        recursive(new ArrayList<>());
        return ans;
    }

    private void recursive(List<Integer> origin) {
        if (origin.size() == nums.length) {
            ans.add(origin);
            return;
        }
        for(int i : nums) {
            if (origin.contains(i)) continue;
            var list = new ArrayList<Integer>();
            for(int o : origin) list.add(o);

            list.add(i);
            recursive(list);
        }
    }
}
```

time:1 beat:80

