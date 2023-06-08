/*
 * @lc app=leetcode.cn id=459 lang=java
 * @lcpr version=21908
 *
 * [459] 重复的子字符串
 * 
 * 129/129 cases passed (83 ms)
 * Your runtime beats 25.8 % of java submissions
 * Your memory usage beats 20.15 % of java submissions (43 MB)
 */

// @lc code=start
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        return (s + s).substring(1, s.length() * 2 - 1).contains(s);
    }
}
// @lc code=end



/*
// @lcpr case=start
// "abab"\n
// "a"\n
// @lcpr case=end

// @lcpr case=start
// "aba"\n
// @lcpr case=end

// @lcpr case=start
// "abcabcabcabc"\n
// @lcpr case=end

 */

