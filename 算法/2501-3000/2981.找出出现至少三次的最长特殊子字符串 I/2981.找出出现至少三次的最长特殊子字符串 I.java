/*
 * @lc app=leetcode.cn id=2981 lang=java
 * @lcpr version=
 *
 * [2981] 找出出现至少三次的最长特殊子字符串 I
 * 
 * 811/811 cases passed (22 ms)
 * Your runtime beats 8.93 % of java submissions
 * Your memory usage beats 23.21 % of java submissions (44.1 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    String s;
    public int maximumLength(String s) {
        this.s = s;
        int ans = -1;
        for(int i = 0; i < s.length() - 1; i++) {
            for(int j = i + 1; j < s.length(); j++) {
                if (check(s.substring(i, j)))
                    ans = Math.max(ans, j - i);
            }
        }
        return ans;
    }
    boolean check(String str) {
        for(int i = 1; i < str.length(); i++)
            if (str.charAt(i) != str.charAt(i - 1)) return false;
        int a = s.indexOf(str);
        if (a == -1) return false;
        int b = s.indexOf(str, a + 1);
        if (b == -1) return false;
        int c = s.indexOf(str, b + 1);
        if (c == -1) return false;
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "aaaa"\n
// "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"\n
// "aacaacaac"\n
// @lcpr case=end

// @lcpr case=start
// "abcdef"\n
// @lcpr case=end

// @lcpr case=start
// "abcaba"\n
// @lcpr case=end

 */

