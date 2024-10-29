/*
 * @lc app=leetcode.cn id=1884 lang=java
 * @lcpr version=
 *
 * [1884] 鸡蛋掉落-两枚鸡蛋
 * 
 * 139/139 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 87.11 % of java submissions (39.4 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int twoEggDrop(int n) {
        int ans = 0;
        int i = 1;
        while(n >= 1) {
            n -= i;
            i++;
            ans++;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 2\n
// @lcpr case=end

// @lcpr case=start
// 100\n
// 1000\n
// 1\n
// @lcpr case=end

 */

