/*
 * @lc app=leetcode.cn id=2486 lang=java
 * @lcpr version=
 *
 * [2486] 追加字符以获得子序列
 * 
 * 85/85 cases passed (4 ms)
 * Your runtime beats 78.26 % of java submissions
 * Your memory usage beats 30.44 % of java submissions (44.4 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int appendCharacters(String s, String t) {
        int p = 0; int q = 0;
        int sn = s.length();
        int tn = t.length();
        while(p < sn && q < tn) {
            if (s.charAt(p) == t.charAt(q)) {
                p++;
                q++;
            } else {
                p++;
            }
        }
        return tn - q;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "coaching"\n"coding"\n
// "abc"\n"abc"\n
// "abcd"\n"abcde"\n
// "a"\n"aaaa"\n
// "abc"\n"def"\n
// "xyz"\n"xyzxyz"\n
// "abcdefgh"\n"hgfedcba"\n
// "aaaa"\n"aa"\n
// @lcpr case=end

// @lcpr case=start
// "abcde"\n"a"\n
// @lcpr case=end

// @lcpr case=start
// "z"\n"abcde"\n
// @lcpr case=end

 */

