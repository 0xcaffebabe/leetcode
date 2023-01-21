/*
 * @lc app=leetcode.cn id=1410 lang=java
 *
 * [1410] HTML 实体解析器
 * 
 * 158/158 cases passed (33 ms)
 * Your runtime beats 44.44 % of java submissions
 * Your memory usage beats 21.21 % of java submissions (42.4 MB)
 */

// @lc code=start
class Solution {
    public String entityParser(String text) {
        return text.replaceAll("&quot;", "\"")
                    .replaceAll("&apos;", "'")
                    .replaceAll("&gt;", ">")
                    .replaceAll("&lt;", "<")
                    .replaceAll("&frasl;", "/")
                    .replaceAll("&amp;", "&");
    }
}
// @lc code=end

