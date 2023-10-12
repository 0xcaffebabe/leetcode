/*
 * @lc app=leetcode.cn id=2562 lang=java
 * @lcpr version=
 *
 * [2562] 找出数组的串联值
 * 
 * 53/53 cases passed (8 ms)
 * Your runtime beats 30.5 % of java submissions
 * Your memory usage beats 12 % of java submissions (42.4 MB)
 */

// @lc code=start
class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long ans = 0;
        int p = 0;
        int q = nums.length - 1;
        while(p <= q) {
            if (p == q) ans += nums[p];
            else ans+= Long.parseLong(nums[p] + "" + nums[q]);
            p++;
            q--;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [7,52,2,4]\n
// @lcpr case=end

// @lcpr case=start
// [5,14,13,8,12]\n
// @lcpr case=end

 */

