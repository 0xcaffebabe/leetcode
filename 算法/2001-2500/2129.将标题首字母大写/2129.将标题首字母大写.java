/*
 * @lc app=leetcode.cn id=2129 lang=java
 *
 * [2129] 将标题首字母大写
 * 
 * 200/200 cases passed (7 ms)
 * Your runtime beats 19.5 % of java submissions
 * Your memory usage beats 9.58 % of java submissions (41.7 MB)
 */

// @lc code=start
class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder sb = new StringBuilder();
        for(var i : title.split(" ")) { 
            if (i.length() <= 2) sb.append(i.toLowerCase() + " ");
            else sb.append(i.substring(0, 1).toUpperCase() + i.substring(1, i.length()).toLowerCase() + " ");
        }
        if (sb.charAt(sb.length() - 1) == ' ') sb.delete(sb.length() - 1, sb.length());
        return sb.toString();
    }
}
// @lc code=end

