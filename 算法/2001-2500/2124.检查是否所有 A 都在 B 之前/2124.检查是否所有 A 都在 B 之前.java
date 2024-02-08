/*
 * @lc app=leetcode.cn id=2124 lang=java
 * @lcpr version=
 *
 * [2124] 检查是否所有 A 都在 B 之前
 * 
 * 216/216 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 22.68 % of java submissions (39.7 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean checkString(String s) {
        int a = -1;
        int b = 1000;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a') a = i;
            if (b == 1000 && c == 'b') b = i;
        }
        return a < b;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "aaabbb"\n
// @lcpr case=end

// @lcpr case=start
// "abab"\n
// @lcpr case=end

// @lcpr case=start
// "bbb"\n
// "aaa"\n
// "a"\n
// "ab"\n
// "b"\n
// "aa"\n
// "bb"\n
// @lcpr case=end

 */

