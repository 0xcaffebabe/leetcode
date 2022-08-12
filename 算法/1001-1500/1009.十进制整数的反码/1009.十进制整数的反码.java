/*
 * @lc app=leetcode.cn id=1009 lang=java
 *
 * [1009] 十进制整数的反码
 * 
 * 128/128 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 45.17 % of java submissions (38.4 MB)
 */

// @lc code=start
class Solution {
    public int bitwiseComplement(int num) {
        if (num == 0) return 1;
        int n = num;
        int mask = 0;
        while(n > 0) {
            mask = mask * 2 + 1;
            n /= 2;
        }
        return mask ^ num;
    }
}
// @lc code=end

