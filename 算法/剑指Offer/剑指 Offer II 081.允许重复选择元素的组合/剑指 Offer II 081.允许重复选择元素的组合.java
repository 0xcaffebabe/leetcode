/*
 * @lc app=leetcode.cn id=剑指 Offer II 081 lang=java
 * @lcpr version=21909
 *
 * [剑指 Offer II 081] 允许重复选择元素的组合
 * 
 * 170/170 cases passed (7 ms)
 * Your runtime beats 6.93 % of java submissions
 * Your memory usage beats 6.31 % of java submissions (43.1 MB)
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



/*
// @lcpr case=start
// [2,3,6,7]\n7\n
// @lcpr case=end

// @lcpr case=start
// [2,3,5]\n8\n
// @lcpr case=end

// @lcpr case=start
// [2]\n1\n
// @lcpr case=end

// @lcpr case=start
// [1]\n1\n
// @lcpr case=end

// @lcpr case=start
// [1]\n2\n
// @lcpr case=end

 */

