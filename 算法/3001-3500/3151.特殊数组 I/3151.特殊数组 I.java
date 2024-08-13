/*
 * @lc app=leetcode.cn id=3151 lang=java
 * @lcpr version=
 *
 * [3151] 特殊数组 I
 * 
 * 852/852 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 48.74 % of java submissions (42.3 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean isArraySpecial(int[] nums) {
        for(int i = 1; i < nums.length; i++) {
            if (Math.abs((nums[i] % 2) - (nums[i-1]%2)) == 0)
                return false;
        }
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1]\n
// [1,1]\n
// [1,2]\n
// @lcpr case=end

// @lcpr case=start
// [2,1,4]\n
// @lcpr case=end

// @lcpr case=start
// [4,3,1,6]\n
// @lcpr case=end

 */

