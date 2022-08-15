/*
 * @lc app=leetcode.cn id=90 lang=java
 *
 * [90] 子集 II
 * 
 * 20/20 cases passed (1 ms)
 * Your runtime beats 99.72 % of java submissions
 * Your memory usage beats 75.63 % of java submissions (41.5 MB)
 */

// @lc code=start
class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    int[] nums;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        this.nums = nums;
        Arrays.sort(this.nums);
        dfs(0, new ArrayList<>());
        return ans;
    }
    void dfs(int index, List<Integer> path) {
        ans.add(new ArrayList<>(path));
        for(int i = index; i < nums.length; i++) {
            // 等于上一个数 跳过 避免重复组合
            if (i > index && nums[i] == nums[i - 1]) continue;
            path.add(nums[i]);
            dfs(i + 1, path);
            path.remove(path.size() - 1);
        }
    }
}
// @lc code=end

