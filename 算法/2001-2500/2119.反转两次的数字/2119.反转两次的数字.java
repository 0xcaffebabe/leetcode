/*
 * @lc app=leetcode.cn id=2119 lang=java
 *
 * [2119] 反转两次的数字
 * 
 * 129/129 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 28.41 % of java submissions (38.5 MB)
 */

// @lc code=start
class Solution {
    public boolean isSameAfterReversals(int num) {
        return cv(cv(num)) == num;
    }
    int cv(int n) {
        int sum = 0;
        while(n > 0) {
            sum = sum*10 + n %10;
            n /= 10;
        }
        return sum;
    }
}
// @lc code=end

