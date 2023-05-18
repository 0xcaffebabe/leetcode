/*
 * @lc app=leetcode.cn id=788 lang=java
 * @lcpr version=21907
 *
 * [788] 旋转数字
 * 
 * 50/50 cases passed (10 ms)
 * Your runtime beats 27.09 % of java submissions
 * Your memory usage beats 8.38 % of java submissions (41.5 MB)
 */

// @lc code=start

class Solution {
    public int rotatedDigits(int n) {
        int ans = 0;
        for(int i = 2; i <= n; i++) {
            var s = String.valueOf(i);
            if (s.contains("3") || s.contains("4") || s.contains("7")) continue;
            if (s.contains("2") || s.contains("5") || s.contains("6") || s.contains("9")) {
                ans++;
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 10\n
// @lcpr case=end

// @lcpr case=start
// 1002\n
// @lcpr case=end

// @lcpr case=start
// 1\n
// @lcpr case=end

// @lcpr case=start
// 10000\n
// @lcpr case=end

 */

