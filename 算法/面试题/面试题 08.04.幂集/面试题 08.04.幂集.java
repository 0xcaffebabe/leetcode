/*
 * @lc app=leetcode.cn id=面试题 08.04 lang=java
 * @lcpr version=
 *
 * [面试题 08.04] 幂集
 * 
 * 10/10 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 49.63 % of java submissions (40.7 MB)
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    int[] nums;
    public List<List<Integer>> subsets(int[] nums) {
        this.nums = nums;
        ans.add(new ArrayList<>());
        bt(0, new ArrayList<>());
        return ans;
    }

    void bt(int n, List<Integer> list) {
        if (list.size() == nums.length) return;
        for(int i = n; i < nums.length; i++) {
            var copy = new ArrayList<>(list);
            copy.add(nums[i]);
            ans.add(copy);
            bt(i + 1, copy);
        }
    }


}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3]\n
// [1,2,2,2,2]\n
// @lcpr case=end

 */

