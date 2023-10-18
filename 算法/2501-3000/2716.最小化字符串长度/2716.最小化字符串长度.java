/*
 * @lc app=leetcode.cn id=2716 lang=java
 * @lcpr version=
 *
 * [2716] 最小化字符串长度
 * 
 * 5013/5013 cases passed (3 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 69.65 % of java submissions (42.7 MB)
 */

// @lc code=start
class Solution {
    public int minimizedStringLength(String s) {
        boolean[] m = new boolean[26];
        for(var c: s.toCharArray()) m[c - 'a'] = true;
        int ans = 0;
        for(var i: m) if (i) ans++;
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "aaabc"\n
// @lcpr case=end

// @lcpr case=start
// "cbbd"\n
// @lcpr case=end

// @lcpr case=start
// "dddaaa"\n
// @lcpr case=end

 */

