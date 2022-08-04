/*
 * @lc app=leetcode.cn id=258 lang=java
 *
 * [258] 各位相加
 * 
 * 1101/1101 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 84.57 % of java submissions (38.5 MB)
 */

// @lc code=start
class Solution {
    public int addDigits(int num) {
        while(num >= 10) num = cv(num);
        return num;
    }
    int cv(int n) {
        int sum = 0;
        while(n >= 10) {
            sum += n%10;
            n /= 10;
        }
        sum += n;
        return sum;
    }
}
// @lc code=end

