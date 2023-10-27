/*
 * @lc app=leetcode.cn id=2180 lang=java
 * @lcpr version=
 *
 * [2180] 统计各位数字之和为偶数的整数个数
 * 
 * 71/71 cases passed (1 ms)
 * Your runtime beats 79.53 % of java submissions
 * Your memory usage beats 57.31 % of java submissions (38.1 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int countEven(int num) {
        int ans = 0;
        for(int i = 2; i <= num; i++) if (check(i)) ans++;
        return ans;
    }
    boolean check(int n) {
        int sum = 0;
        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum % 2 == 0;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 4\n
// @lcpr case=end

// @lcpr case=start
// 30\n
// 1\n
// 1000\n
// 999\n
// @lcpr case=end

 */

