/*
 * @lc app=leetcode.cn id=3168 lang=java
 * @lcpr version=
 *
 * [3168] 候诊室中的最少椅子数
 * 
 * 852/852 cases passed (1 ms)
 * Your runtime beats 93.31 % of java submissions
 * Your memory usage beats 55.96 % of java submissions (41.2 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int minimumChairs(String s) {
        int ans = 0;
        int cnt = 0;
        for(var c: s.toCharArray()) {
            if (c == 'E') cnt++;
            else cnt--;
            ans = Math.max(ans, cnt);
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "EEEEEEE"\n
// @lcpr case=end

// @lcpr case=start
// "ELELEEL"\n
// @lcpr case=end

// @lcpr case=start
// "ELEELEELLL"\n
// "EL"\n
// @lcpr case=end

 */

