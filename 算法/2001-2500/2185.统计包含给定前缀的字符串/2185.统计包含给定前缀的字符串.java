/*
 * @lc app=leetcode.cn id=2185 lang=java
 * @lcpr version=
 *
 * [2185] 统计包含给定前缀的字符串
 * 
 * 95/95 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 31.48 % of java submissions (40.9 MB)
 */

// @lc code=start
class Solution {
    public int prefixCount(String[] words, String pref) {
        int ans = 0;
        for(var i : words) if (i.startsWith(pref)) ans++;
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["pay","attention","practice","attend"]\n"at"\n
// @lcpr case=end

// @lcpr case=start
// ["leetcode","win","loops","success"]\n"code"\n
// @lcpr case=end

 */

