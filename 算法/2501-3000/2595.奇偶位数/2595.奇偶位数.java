/*
 * @lc app=leetcode.cn id=2595 lang=java
 * @lcpr version=
 *
 * [2595] 奇偶位数
 * 
 * 1002/1002 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 58.44 % of java submissions (40.3 MB)
 */

// @lc code=start
class Solution {
    public int[] evenOddBit(int n) {
        int even = 0;
        int odd = 0;
        int i = 0;
        while(n > 0) {
            if (n % 2 == 1)
                if (i % 2 == 0) even++;
                else odd++;
            n /= 2;
            i++;
        }
        return new int[]{even, odd};
    }
}
// @lc code=end



/*
// @lcpr case=start
// 17\n
// 999\n
// 1000\n
// 1\n
// 333\n
// @lcpr case=end

// @lcpr case=start
// 2\n
// @lcpr case=end

 */

