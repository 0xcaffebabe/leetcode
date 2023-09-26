/*
 * @lc app=leetcode.cn id=2798 lang=java
 * @lcpr version=
 *
 * [2798] 满足目标工作时长的员工数目
 * 
 * 707/707 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 34.71 % of java submissions (40.1 MB)
 */

// @lc code=start
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int ans = 0;
        for(var i : hours) if(i >= target) ans++;
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [0,1,2,3,4]\n2\n
// @lcpr case=end

// @lcpr case=start
// [5,1,4,2,2]\n6\n
// @lcpr case=end

 */

