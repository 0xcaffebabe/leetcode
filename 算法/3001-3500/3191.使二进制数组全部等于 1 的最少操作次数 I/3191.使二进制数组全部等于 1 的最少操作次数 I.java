/*
 * @lc app=leetcode.cn id=3191 lang=java
 * @lcpr version=
 *
 * [3191] 使二进制数组全部等于 1 的最少操作次数 I
 * 
 * 689/689 cases passed (7 ms)
 * Your runtime beats 67.13 % of java submissions
 * Your memory usage beats 56.33 % of java submissions (56.2 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;

class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i = 0; i < n - 2; i++) {
            if (nums[i] == 0) {
                ans++;
                for(int j = i; j <= i + 2; j++) {
                    nums[j] ^= 1;
                }
            }
        }
        // System.out.println(Arrays.toString(nums));
        if (nums[n - 1] == 1 && nums[n - 2] == 1) return ans;
        return -1;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [0,1,1,1,0,0]\n
// [0,0,0]\n
// [1,1,1]\n
// [0,1,1]\n
// [1,0,0]\n
// @lcpr case=end

// @lcpr case=start
// [0,1,1,1]\n
// @lcpr case=end

 */

