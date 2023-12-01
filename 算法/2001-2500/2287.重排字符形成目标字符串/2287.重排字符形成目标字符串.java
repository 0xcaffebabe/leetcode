/*
 * @lc app=leetcode.cn id=2287 lang=java
 * @lcpr version=
 *
 * [2287] 重排字符形成目标字符串
 * 
 * 115/115 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 68.18 % of java submissions (39.4 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] m = new int[128];
        for(var c: s.toCharArray()) m[c]++;
        char[] t = target.toCharArray();
        int ans = 0;
        while(true) {
            boolean none = false;
            for(var i : t) {
                if (m[i] <= 0) {
                    none = true;
                    break;
                }
                m[i]--;
            }
            if (none) break;
            ans++;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "ilovecodingonleetcode"\n"code"\n
// @lcpr case=end

// @lcpr case=start
// "abcba"\n"abc"\n
// @lcpr case=end

// @lcpr case=start
// "abbaccaddaeea"\n"aaaaa"\n
// "aaaabbccddeeeffgg"\n"abc"\n
// "aabbccddeeffgghh"\n"abcd"\n
// "abcabcabcabc"\n"abc"\n
// "programmingcompetition"\n"progcomp"\n
// @lcpr case=end

 */

