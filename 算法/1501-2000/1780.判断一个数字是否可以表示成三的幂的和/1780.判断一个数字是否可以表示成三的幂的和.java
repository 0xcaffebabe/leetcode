/*
 * @lc app=leetcode.cn id=1780 lang=java
 * @lcpr version=
 *
 * [1780] 判断一个数字是否可以表示成三的幂的和
 * 
 * 129/129 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 63.56 % of java submissions (38.1 MB)
 */

// @lc code=start
class Solution {
    public boolean checkPowersOfThree(int n) {
        while(n > 0) {
            if (n % 3 == 2) {
                return false;
            }
            n /= 3;
        }
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 12\n
// @lcpr case=end

// @lcpr case=start
// 91\n
// @lcpr case=end

// @lcpr case=start
// 21\n
// 999\n
// @lcpr case=end

 */

