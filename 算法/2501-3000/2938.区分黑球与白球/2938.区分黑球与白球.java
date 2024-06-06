/*
 * @lc app=leetcode.cn id=2938 lang=java
 * @lcpr version=
 *
 * [2938] 区分黑球与白球
 * 
 * 581/581 cases passed (8 ms)
 * Your runtime beats 85.71 % of java submissions
 * Your memory usage beats 5.55 % of java submissions (44.7 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public long minimumSteps(String s) {
        long count = 0;
        long ans = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            var c = s.charAt(i);
            if (c == '0') count++;
            else ans += count;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "101"\n
// @lcpr case=end

// @lcpr case=start
// "100"\n
// @lcpr case=end

// @lcpr case=start
// "0111"\n
// "10101010"\n
// "10001100001100011"\n
// @lcpr case=end

 */

