/*
 * @lc app=leetcode.cn id=2148 lang=java
 * @lcpr version=30112
 *
 * [2148] 元素计数
 * 
 * 127/127 cases passed (1 ms)
 * Your runtime beats 69.86 % of java submissions
 * Your memory usage beats 21.53 % of java submissions (39.9 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
`// @lc code=start

import java.util.Arrays;
import java.util.Set;

class Solution {
    public int countElements(int[] nums) {
        if (nums.length < 3) return 0;
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length - 1];
        int ans = 0;
        for(var i : nums)
            if (i > min && i < max) ans++;
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [11,7,2,15]\n
// @lcpr case=end

// @lcpr case=start
// [-3,3,3,90]\n
// [3,3,3]\n
// [3,3]\n
// [3]\n
// [3,2,3,4]\n
// @lcpr case=end

 */

