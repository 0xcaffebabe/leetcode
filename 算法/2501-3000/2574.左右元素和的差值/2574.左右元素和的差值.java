/*
 * @lc app=leetcode.cn id=2574 lang=java
 * @lcpr version=
 *
 * [2574] 左右元素和的差值
 * 
 * 53/53 cases passed (2 ms)
 * Your runtime beats 48.98 % of java submissions
 * Your memory usage beats 88.89 % of java submissions (42.4 MB)
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int lsum = 0;
        int rsum = 0;
        for(int i = 1; i < nums.length; i++) {
            lsum += nums[i - 1];
            left[i] = lsum;
        }
        for(int i = nums.length - 2; i >= 0 ; i--) {
            rsum += nums[i + 1];
            right[i] = rsum;
        }
        
        int[] ans = new int[nums.length];
        // System.out.println(Arrays.toString(left));
        // System.out.println(Arrays.toString(right));
        for(int i = 0; i < nums.length; i++) 
            ans[i] = Math.abs(left[i] - right[i]);
        return ans;

    }
}
// @lc code=end



/*
// @lcpr case=start
// [10,4,8,3]\n
// @lcpr case=end

// @lcpr case=start
// [1]\n
// [1,2,3,4,5,6,7,56]\n
// [1,2]\n
// [1,2,3]\n
// @lcpr case=end

 */

