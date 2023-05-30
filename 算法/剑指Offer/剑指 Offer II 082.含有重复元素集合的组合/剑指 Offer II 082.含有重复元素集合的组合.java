/*
 * @lc app=leetcode.cn id=剑指 Offer II 082 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 082] 含有重复元素集合的组合
 * 
 * 174/174 cases passed (7 ms)
 * Your runtime beats 17.07 % of java submissions
 * Your memory usage beats 5.02 % of java submissions (43.4 MB)
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



/*
// @lcpr case=start
// [10,1,2,7,6,1,5]\n8\n
// [2,5,2,1,2]\n5\n
// [2]\n5\n
// [5]\n5\n
// @lcpr case=end


 */

