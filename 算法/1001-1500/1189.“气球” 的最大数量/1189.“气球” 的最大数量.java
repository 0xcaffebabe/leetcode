/*
 * @lc app=leetcode.cn id=1189 lang=java
 * @lcpr version=
 *
 * [1189] “气球” 的最大数量
 * 
 * 27/27 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 35.26 % of java submissions (39.9 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] m = new int[128];
        for(var i : text.toCharArray()) m[i]++;

        int ans = Integer.MAX_VALUE;
        ans = Math.min(m['b'], ans);
        ans = Math.min(m['a'], ans);
        ans = Math.min(m['l'] / 2, ans);
        ans = Math.min(m['o'] / 2, ans);
        ans = Math.min(m['n'], ans);
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "nlaebolko"\n
// @lcpr case=end

// @lcpr case=start
// "loonbalxballpoon"\n
// @lcpr case=end

// @lcpr case=start
// "leetcode"\n
// "ballballoonoon"\n
// @lcpr case=end

 */

