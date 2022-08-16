/*
 * @lc app=leetcode.cn id=6 lang=java
 *
 * [6] Z 字形变换
 * 
 * 1157/1157 cases passed (32 ms)
 * Your runtime beats 23.92 % of java submissions
 * Your memory usage beats 5.02 % of java submissions (49 MB)
 */

// @lc code=start
class Solution {
    public String convert(String s, int numRows) {
        if (s.length() == 1 || numRows == 1) return s;
        Character[][] mat = new Character[numRows][s.length()];
        int p = 0;
        int x = 0;
        int y = 0;
        boolean flag = false;
        while(p < s.length()) {
            char c = s.charAt(p++);
            // System.out.println(x + "|" + y);
            mat[y][x] = c;
            if (flag && y != 0) {
                x++;
                y--;
            }else if (flag && y == 0) {
                flag = false;
                y++;
            } else if (y == numRows - 1) {
                y--;
                x++;
                flag = true;
            } else if (y < numRows - 1) {
                y++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(var i : mat){
            for(var j : i) if (j != null) sb.append(j);
        }
        return sb.toString();
    }
}
// @lc code=end

