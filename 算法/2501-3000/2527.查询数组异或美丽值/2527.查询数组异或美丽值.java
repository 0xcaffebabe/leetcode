/*
 * @lc app=leetcode.cn id=2527 lang=java
 * @lcpr version=
 *
 * [2527] 查询数组异或美丽值
 * 
 * 32/32 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 30.16 % of java submissions (53.8 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int xorBeauty(int[] nums) {
        int sum = 0;
        for(var i: nums) sum ^= i;
        return sum;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,4]\n
// @lcpr case=end

// @lcpr case=start
// [15,45,20,2,34,35,5,44,32,30]\n
// @lcpr case=end

 */

