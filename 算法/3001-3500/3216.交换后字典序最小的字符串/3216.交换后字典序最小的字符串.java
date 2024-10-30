/*
 * @lc app=leetcode.cn id=3216 lang=java
 * @lcpr version=
 *
 * [3216] 交换后字典序最小的字符串
 * 
 * 895/895 cases passed (3 ms)
 * Your runtime beats 5.56 % of java submissions
 * Your memory usage beats 5.59 % of java submissions (42.6 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public String getSmallestString(String s) {
        StringBuilder sb = new StringBuilder(s);
        String ans = s;
        for(int i = 0; i < sb.length() - 1; i++) {
            if (sb.charAt(i) % 2 == sb.charAt(i + 1) % 2) {
                char c = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(i + 1));
                sb.setCharAt(i + 1, c);
                var t = sb.toString();
                if (t.compareTo(ans) < 0) ans = t;

                sb.setCharAt(i + 1, sb.charAt(i));
                sb.setCharAt(i, c);
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "45320"\n
// "987654321"\n
// "21"\n
// "12"\n
// "1234"\n
// "987654321987654321987654321987654321987654321987654321987654321987654321987654321987654321987654321"\n
// @lcpr case=end

// @lcpr case=start
// "001"\n
// @lcpr case=end

 */

