/*
 * @lc app=leetcode.cn id=39 lang=java
 *
 * [39] 组合总和
 * 
 * 171/171 cases passed (8 ms)
 * Your runtime beats 5.95 % of java submissions
 * Your memory usage beats 5.52 % of java submissions (42.3 MB)
 */

// @lc code=start
class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    int[] candidates;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.candidates = candidates;
        dfs(new ArrayList<>(), target, 0);
        return ans;
    }

    void dfs(List<Integer> path, int target, int index) {
        if (target < 0 || index >= candidates.length) return;
        if (target == 0) {
            ans.add(path);
            return;
        }
        // 分叉，选择下一个
        dfs(path, target, index + 1);

        // 选择当前
        var list = new ArrayList<Integer>(path);
        list.add(candidates[index]);
        dfs(list, target - candidates[index], index);
    }
}
// @lc code=end

