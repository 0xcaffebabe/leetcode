/*
 * @lc app=leetcode.cn id=78 lang=java
 *
 * [78] 子集
 */

// @lc code=start
class Solution {
    private List<List<Integer>> ans = new ArrayList<>(16);
    private int[] nums;
    {
        ans.add(new ArrayList<>());
    }

    public List<List<Integer>> subsets(int[] nums) {
        this.nums = nums;
        recursive(new ArrayList<>(), 0);
        return ans;
    }

    private void recursive(List<Integer> origin, int start) {
        if (origin.size() == nums.length) return;
        for(int i = start; i < nums.length; i++) {
            var list = new ArrayList<Integer>();
            for(int o: origin) {
                if (o != nums[i]) list.add(o);
            }
            list.add(nums[i]);
            ans.add(list);
            recursive(list, i + 1);
        }
    }
}
// @lc code=end

