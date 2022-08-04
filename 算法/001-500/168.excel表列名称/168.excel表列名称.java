/*
 * @lc app=leetcode.cn id=168 lang=java
 *
 * [168] Excel表列名称
 * 
 * 18/18 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 38.9 % of java submissions (38.7 MB)
 */

// @lc code=start
class Solution {
    public String convertToTitle(int columnNumber) {
        char[] con = new char[10];
        int pos = 0;
        while(columnNumber > 0) {
            columnNumber--;
            char c = (char)(columnNumber % 26 + 65);
            columnNumber /= 26;
            con[pos++] = c;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = pos - 1; i >= 0; i--) sb.append(con[i]);
        return sb.toString();
    }
}
// @lc code=end

