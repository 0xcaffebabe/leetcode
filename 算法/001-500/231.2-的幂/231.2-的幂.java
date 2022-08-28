/*
 * @lc app=leetcode.cn id=231 lang=java
 *
 * [231] 2 的幂
 */

// @lc code=start
class Solution {
    public boolean isPowerOfTwo(int n) {
        int k = 1;
        while (true){
            if (n == k) return true;
            if (k > n) return false;
            if (k < 0) break;
            k <<= 1;
        }
        return false;
    }
}
// @lc code=end

