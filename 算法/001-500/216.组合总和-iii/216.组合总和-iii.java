import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=216 lang=java
 *
 * [216] 组合总和 III
 * 
 * 18/18 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 46.98 % of java submissions (39.1 MB)
 */

// @lc code=start
class Solution {
    int k;
    int n;
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        this.k = k;
        this.n = n;
        dfs(new ArrayList<>(), 1, n);
        return ans;
    }
    void dfs(List<Integer> path, int start, int target) {
        if (target < 0 || start > 10) return;
        if (path.size() == k && target == 0) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int i = start; i < 10; i++) {
            path.add(i);
            dfs(path, i+1, target - i);
            path.remove(path.size() -1);
        }
    }
}
// @lc code=end

