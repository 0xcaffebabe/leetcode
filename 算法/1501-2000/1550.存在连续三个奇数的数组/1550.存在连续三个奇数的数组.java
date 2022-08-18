/*
 * @lc app=leetcode.cn id=1550 lang=java
 *
 * [1550] 存在连续三个奇数的数组
 * 
 * 32/32 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 56 % of java submissions (40.8 MB)
 */

// @lc code=start
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i = 1; i < arr.length - 1; i++) {
            boolean a = arr[i - 1] % 2 == 1;
            boolean b = arr[i] % 2 == 1;
            boolean c = arr[i + 1] % 2 == 1;
            if (a && b && c) return true;
        }
        return false;
    }
}
// @lc code=end

