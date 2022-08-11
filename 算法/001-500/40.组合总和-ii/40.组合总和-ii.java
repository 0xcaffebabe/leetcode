/*
 * @lc app=leetcode.cn id=40 lang=java
 *
 * [40] 组合总和 II
 * 
 * 176/176 cases passed (8 ms)
 * Your runtime beats 5.48 % of java submissions
 * Your memory usage beats 10.46 % of java submissions (42.2 MB)
 */

// @lc code=start
class Solution {
    int[] candidates;
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        this.candidates = candidates;
        Arrays.sort(candidates);
        dfs(new ArrayList<>(), target, 0);
        return ans;
    }

    void dfs(List<Integer> path, int target, int index) {
        if (target < 0) return;
        if (target == 0) {
            ans.add(path);
            return;
        }
        for(int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i-1]) continue;
            var list = new ArrayList<Integer>(path);
            list.add(candidates[i]);
            dfs(list, target - candidates[i], i + 1);
        }

    }
}
// @lc code=end

