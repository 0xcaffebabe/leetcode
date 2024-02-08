/*
 * @lc app=leetcode.cn id=2740 lang=java
 * @lcpr version=
 *
 * [2740] 找出分区值
 * 
 * 806/806 cases passed (21 ms)
 * Your runtime beats 38.06 % of java submissions
 * Your memory usage beats 99.25 % of java submissions (52.6 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;

class Solution {
    public int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length - 1; i++)
            ans = Math.min(nums[i + 1] - nums[i], ans);
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,3,2,4]\n
// [1,88,99,40,199]\n
// @lcpr case=end

// @lcpr case=start
// [100,1,10]\n
// @lcpr case=end

 */

