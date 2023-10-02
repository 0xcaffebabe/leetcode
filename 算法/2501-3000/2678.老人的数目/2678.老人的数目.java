/*
 * @lc app=leetcode.cn id=2678 lang=java
 * @lcpr version=
 *
 * [2678] 老人的数目
 * 
 * 303/303 cases passed (1 ms)
 * Your runtime beats 73.47 % of java submissions
 * Your memory usage beats 11.97 % of java submissions (40.6 MB)
 */

// @lc code=start
class Solution {
    public int countSeniors(String[] details) {
        int ans = 0;
        for(var i : details) if (Integer.parseInt(i.substring(11, 13)) > 60) ans++;
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["7868190130M7522","5303914400F9211","9273338290F4010"]\n
// @lcpr case=end

// @lcpr case=start
// ["1313579440F2036","2921522980M5644"]\n
// ["1313579440F2036","2921522980M6044"]\n
// @lcpr case=end

 */

