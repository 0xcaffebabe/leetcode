/*
 * @lc app=leetcode.cn id=405 lang=java
 *
 * [405] 数字转换为十六进制数
 * 
 * 100/100 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 97.01 % of java submissions (38.4 MB)
 */

// @lc code=start
class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";
        String map = "0123456789abcdef";
        StringBuilder ans = new StringBuilder();
        while(ans.length() < 8 && num != 0) {
            ans.append(map.charAt(num & 0xf));
            num >>= 4;
        }
        return ans.reverse().toString();
    }
}
// @lc code=end

