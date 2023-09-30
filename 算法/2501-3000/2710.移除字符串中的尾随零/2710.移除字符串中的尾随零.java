/*
 * @lc app=leetcode.cn id=2710 lang=java
 * @lcpr version=
 *
 * [2710] 移除字符串中的尾随零
 * 
 * 756/756 cases passed (4 ms)
 * Your runtime beats 24.61 % of java submissions
 * Your memory usage beats 61.83 % of java submissions (42.6 MB)
 */

// @lc code=start
class Solution {
    public String removeTrailingZeros(String num) {
        StringBuilder sb = new StringBuilder(num);
        for(int i = sb.length() - 1; i >= 0; i--) {
            if (sb.charAt(i) != '0') break;
            if (sb.charAt(i) == '0') sb.deleteCharAt(i);
        }
        return sb.toString();
    }
}
// @lc code=end



/*
// @lcpr case=start
// "51230100"\n
// @lcpr case=end

// @lcpr case=start
// "123"\n
// "1000"\n
// "1111"\n
// @lcpr case=end

 */

