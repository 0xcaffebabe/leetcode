/*
 * @lc app=leetcode.cn id=2974 lang=java
 * @lcpr version=
 *
 * [2974] 最小数字游戏
 * 
 * 804/804 cases passed (2 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 100 % of java submissions (43.9 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;

class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i += 2) {
            ans[i] = nums[i + 1];
            ans[i + 1] = nums[i];
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [5,4,2,3]\n
// @lcpr case=end

// @lcpr case=start
// [2,5]\n
// @lcpr case=end

 */

