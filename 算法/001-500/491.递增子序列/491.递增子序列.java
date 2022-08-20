import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=491 lang=java
 *
 * [491] 递增子序列
 * 
 * 58/58 cases passed (3 ms)
 * Your runtime beats 95.72 % of java submissions
 * Your memory usage beats 52.52 % of java submissions (47.4 MB)
 */

// @lc code=start
class Solution {
    int[] nums;
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        this.nums = nums;
        dfs(0, new ArrayList<>());
        return ans;
    }
    void dfs(int index, List<Integer> path) {
        if (index >= nums.length) {
            if (path.size() >= 2) ans.add(new ArrayList<>(path));
            return;
        }
        // 分两条路搜索 一个以上一个数字为底（当前数字与当前数字不同才搜索，为了避免重复）
        if (path.size() == 0 || (path.size() > 0 && nums[index] != path.get(path.size() - 1))) {
            dfs(index + 1, path);
        }
        // 一个以当前数字为底
        if (path.size() == 0 || nums[index] >= path.get(path.size() -1)) {
            path.add(nums[index]);
            dfs(index + 1, path);
            path.remove(path.size() - 1);
        }
        
    }
}
// @lc code=end

