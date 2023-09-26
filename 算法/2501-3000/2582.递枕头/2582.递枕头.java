/*
 * @lc app=leetcode.cn id=2582 lang=java
 * @lcpr version=
 *
 * [2582] 递枕头
 * 
 * 68/68 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 22.02 % of java submissions (38.2 MB)
 */

// @lc code=start
class Solution {
    public int passThePillow(int n, int time) {
        int p = 1;
        int f = 1;
        while(time > 0) {
            p += f * 1;
            if (p == n || p == 1) f = -f;
            time--;
        }
        return p;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 4\n5\n
// 1000\n1000\n
// 2\n1000\n
// @lcpr case=end

// @lcpr case=start
// 3\n2\n
// @lcpr case=end

 */

