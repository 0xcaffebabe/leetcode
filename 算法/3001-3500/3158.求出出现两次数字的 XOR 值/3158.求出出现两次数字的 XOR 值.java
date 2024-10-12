/*
 * @lc app=leetcode.cn id=3158 lang=java
 * @lcpr version=
 *
 * [3158] 求出出现两次数字的 XOR 值
 * 
 * 833/833 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 96.3 % of java submissions (41.6 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        boolean[] m = new boolean[51];
        int sum = 0;
        for(var i: nums)
            if (m[i]) sum ^= i;
            else m[i] = true;
        return sum;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,1,3]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,2,1]\n
// @lcpr case=end

 */

