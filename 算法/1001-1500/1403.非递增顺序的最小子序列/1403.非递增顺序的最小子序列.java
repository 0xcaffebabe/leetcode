/*
 * @lc app=leetcode.cn id=1403 lang=java
 * @lcpr version=
 *
 * [1403] 非递增顺序的最小子序列
 * 
 * 103/103 cases passed (3 ms)
 * Your runtime beats 93.89 % of java submissions
 * Your memory usage beats 46.3 % of java submissions (42.7 MB)
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(var i : nums) sum += i;
        List<Integer> ans = new ArrayList<>();
        int lsum = 0;
        for(int i = nums.length - 1; i >= 0; i--) {
            if (lsum > sum) break;
            ans.add(nums[i]);
            sum -= nums[i];
            lsum += nums[i];
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [4,3,10,9,8]\n
// @lcpr case=end

// @lcpr case=start
// [4,4,7,6,7]\n
// @lcpr case=end

// @lcpr case=start
// [6]\n
// @lcpr case=end

 */

