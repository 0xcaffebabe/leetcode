/*
 * @lc app=leetcode.cn id=3271 lang=java
 * @lcpr version=
 *
 * [3271] 哈希分割字符串
 * 
 * 1066/1066 cases passed (2 ms)
 * Your runtime beats 75.77 % of java submissions
 * Your memory usage beats 69.29 % of java submissions (43.7 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public String stringHash(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for(int i = 0; i < s.length(); i++) {
            if (i != 0 && i % k == 0) {
                sb.append((char)((sum % 26) + 'a'));
                sum = 0;
            }
            sum += s.charAt(i) - 'a';
        }
        sb.append((char)((sum % 26) + 'a'));
        return sb.toString();
    }
}
// @lc code=end



/*
// @lcpr case=start
// "abcd"\n2\n
// "b"\n1\n
// "a"\n1\n
// "aa"\n2\n
// "bb"\n2\n
// "ao"\n1\n
// @lcpr case=end

// @lcpr case=start
// "mxz"\n3\n
// @lcpr case=end

 */

