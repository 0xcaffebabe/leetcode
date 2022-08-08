/*
 * @lc app=leetcode.cn id=1332 lang=java
 *
 * [1332] 删除回文子序列
 * 
 * 48/48 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 10.46 % of java submissions (39.6 MB)
 */

// @lc code=start
class Solution {
    public int removePalindromeSub(String s) {
        return new StringBuilder(s).reverse().toString().equals(s) ? 1 : 2;
    }
}
// @lc code=end

