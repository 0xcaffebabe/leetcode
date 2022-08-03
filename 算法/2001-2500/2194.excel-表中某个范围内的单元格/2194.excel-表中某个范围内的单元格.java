/*
 * @lc app=leetcode.cn id=2194 lang=java
 *
 * [2194] Excel 表中某个范围内的单元格
 * 
 * 251/251 cases passed (5 ms)
 * Your runtime beats 54.81 % of java submissions
 * Your memory usage beats 26.74 % of java submissions (42.3 MB)
 */

// @lc code=start
class Solution {
    public List<String> cellsInRange(String s) {
        char x1 = s.charAt(0);
        int y1 = s.charAt(1) - '0';
        char x2 = s.charAt(3);
        int y2 = s.charAt(4) - '0';
        List<String> ans = new ArrayList<>(16);
        for(char x = x1; x <= x2; x++) {
            for(int y = y1; y <= y2; y++) ans.add("" + x + y);
        }
        return ans;
    }
}
// @lc code=end

