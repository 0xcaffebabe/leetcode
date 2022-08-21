import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=442 lang=java
 *
 * [442] 数组中重复的数据
 * 
 * 28/28 cases passed (7 ms)
 * Your runtime beats 26.82 % of java submissions
 * Your memory usage beats 99.21 % of java submissions (48.8 MB)
 */

// @lc code=start
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for(var i : nums) {
            i = Math.abs(i);
            // 标记数字 i 已经出现过了
            if (nums[i - 1] > 0) nums[i - 1] = -nums[i - 1];
            else ans.add(i);
        }
        return ans;
    }
}
// @lc code=end

