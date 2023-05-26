/*
 * @lc app=leetcode.cn id=剑指 Offer 21 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer 21] 调整数组顺序使奇数位于偶数前面
 * 
 * 17/17 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 15.68 % of java submissions (50 MB)
 */

// @lc code=start
class Solution {
    public int[] exchange(int[] nums) {
        if (nums.length == 1) return nums;
        int p = 0, q = nums.length - 1;
        int[] ret = new int[nums.length];
        for(int i : nums){
            if (i % 2 == 1) ret[p++] = i;
            else ret[q--] = i;
        }
        return ret;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,4]\n
// @lcpr case=end

 */

