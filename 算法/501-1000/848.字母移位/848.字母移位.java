/*
 * @lc app=leetcode.cn id=848 lang=java
 * @lcpr version=21907
 *
 * [848] 字母移位
 * 
 * 53/53 cases passed (17 ms)
 * Your runtime beats 17.57 % of java submissions
 * Your memory usage beats 40.54 % of java submissions (53.3 MB)
 */

// @lc code=start
class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        for(int i = shifts.length - 1; i > 0; i--) 
            shifts[i - 1] = (shifts[i - 1] % 26 + shifts[i] % 26) % 26;
        StringBuilder sb = new StringBuilder(s);
        for(int i = sb.length() - 1; i >= 0; i--) {
            char c = sb.charAt(i);
            sb.setCharAt(i, (char)((c - 'a' + shifts[i]) % 26 + 97));
        }
        return sb.toString();
    }
}
// @lc code=end



/*
// @lcpr case=start
// "abc"\n[3,5,9]\n
// @lcpr case=end

// @lcpr case=start
// "abc"\n[3,55682165,98898989]\n
// @lcpr case=end

// @lcpr case=start
// "aaa"\n[1,2,3]\n
// @lcpr case=end

 */

