/*
 * @lc app=leetcode.cn id=2960 lang=java
 * @lcpr version=
 *
 * [2960] 统计已测试设备
 * 
 * 520/520 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 69.53 % of java submissions (42.1 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int ans = 0;
        int inc = 0;
        for(var i: batteryPercentages) {
            if (inc + i > 0) {
                ans++;
                inc--;
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,1,2,1,3]\n
// @lcpr case=end

// @lcpr case=start
// [0,1,2]\n
// [0]\n
// [1]\n
// [1,2]\n
// [0,1]\n
// @lcpr case=end

 */

