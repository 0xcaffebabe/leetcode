/*
 * @lc app=leetcode.cn id=3153 lang=java
 * @lcpr version=
 *
 * [3153] 所有数对中数位不同之和
 * 
 * 643/643 cases passed (13 ms)
 * Your runtime beats 93.9 % of java submissions
 * Your memory usage beats 84.88 % of java submissions (57.5 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public long sumDigitDifferences(int[] nums) {
        long ans = 0;
        int n = nums.length;
        while(nums[0] != 0) {
            int[] m = new int[10];
            for(int i = 0; i < nums.length; i++) {
                m[nums[i] % 10]++;
                nums[i] /= 10;
            }
            for(var j: m) {
                if (j > 0) ans += (long)j * (n - j);
            }
        }
        return ans / 2;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [13,23,12]\n
// [1,1]\n
// @lcpr case=end

// @lcpr case=start
// [10,10,10,10]\n
// @lcpr case=end

 */

