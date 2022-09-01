/*
 * @lc app=leetcode.cn id=717 lang=java
 *
 * [717] 1 比特与 2 比特字符
 * 
 * 93/93 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 37.27 % of java submissions (41.1 MB)
 */

// @lc code=start
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while(i < bits.length) {
            if (i == bits.length - 1) return true;
            i += bits[i] + 1;
        }
        return false;
    }
}
// @lc code=end

