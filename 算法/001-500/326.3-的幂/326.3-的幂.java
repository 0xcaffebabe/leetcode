/*
 * @lc app=leetcode.cn id=326 lang=java
 *
 * [326] 3 的幂
 * 
 * 21038/21038 cases passed (8 ms)
 * Your runtime beats 80.24 % of java submissions
 * Your memory usage beats 25.94 % of java submissions (41.3 MB)
 */

// @lc code=start
class Solution {
    public boolean isPowerOfThree(int n) {
        while(n != 0 && n % 3 == 0) n /= 3;
        return n == 1;
    }
}
// @lc code=end

