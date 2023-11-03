/*
 * @lc app=leetcode.cn id=2815 lang=java
 * @lcpr version=
 *
 * [2815] 数组中的最大数对和
 * 
 * 3006/3006 cases passed (36 ms)
 * Your runtime beats 29.37 % of java submissions
 * Your memory usage beats 97.12 % of java submissions (42.3 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int maxSum(int[] nums) {
        int ans = -1;
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if (maxD(nums[i]) == maxD(nums[j]))
                    ans = Math.max(ans, nums[i] + nums[j]);
            }
        }
        return ans;
    }

    int maxD(int n) {
        int ans = 0;
        while(n > 0) {
            ans = Math.max(ans, n % 10);
            n /= 10;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [51,71,17,24,42]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,4]\n
// [11,22,32,44]\n
// [11,101,1001,44]\n
// @lcpr case=end

 */

