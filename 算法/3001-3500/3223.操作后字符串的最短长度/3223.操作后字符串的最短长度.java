/*
 * @lc app=leetcode.cn id=3223 lang=java
 * @lcpr version=
 *
 * [3223] 操作后字符串的最短长度
 * 
 * 702/702 cases passed (11 ms)
 * Your runtime beats 78.67 % of java submissions
 * Your memory usage beats 60.13 % of java submissions (45.1 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int minimumLength(String s) {
        int[] m = new int[26];
        int ans = 0;
        for(var c: s.toCharArray()) m[c - 'a']++;
        for(var i: m) {
            if (i > 0) ans += 2 - i % 2;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "abaacbcbb"\n
// "a"\n
// "aa"\n
// "aaa"\n
// "aaaaaaaaaaa"\n
// @lcpr case=end

// @lcpr case=start
// "aa"\n
// @lcpr case=end

 */

