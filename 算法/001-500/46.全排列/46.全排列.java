/*
 * @lc app=leetcode.cn id=46 lang=java
 *
 * [46] 全排列
 * 
 * 26/26 cases passed (1 ms)
 * Your runtime beats 80.88 % of java submissions
 * Your memory usage beats 21.02 % of java submissions (41.9 MB)
 */

// @lc code=start
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
// @lc code=end

