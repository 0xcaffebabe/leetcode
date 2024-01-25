/*
 * @lc app=leetcode.cn id=2980 lang=java
 * @lcpr version=
 *
 * [2980] 检查按位或是否存在尾随零
 * 
 * 916/916 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 22.76 % of java submissions (43.2 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int even = 0;
        for(var i : nums) if (i % 2 == 0) even++;
        return even >= 2;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,4,5]\n
// [4,6,4]\n
// @lcpr case=end

// @lcpr case=start
// [2,4,8,16]\n
// @lcpr case=end

// @lcpr case=start
// [1,3,5,7,9]\n
// [1,2]\n
// [2,2]\n
// @lcpr case=end

 */

