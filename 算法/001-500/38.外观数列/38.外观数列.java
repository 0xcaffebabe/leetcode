/*
 * @lc app=leetcode.cn id=38 lang=java
 *
 * [38] 外观数列
 * 
 * 30/30 cases passed (17 ms)
 * Your runtime beats 15.27 % of java submissions
 * Your memory usage beats 18.52 % of java submissions (41.4 MB)
 */

// @lc code=start
class Solution {
    public String countAndSay(int n) {
        String prev = "1";
        for(int i = 2; i <= n; i++) {
            int pos = 0;
            int start = 0;
            StringBuilder cur = new StringBuilder();
            
            // 遍历上个字符串
            while(pos < prev.length()) {
                // 遍历到当前字符不等于最开头的那个字符
                while(pos < prev.length() && prev.charAt(pos) == prev.charAt(start)) pos++;
                cur.append((pos - start) + "" + prev.charAt(start));
                // 完成后下一轮遍历从上次结束的地方开始
                start = pos;
            }
            prev = cur.toString();
        }
        return prev;
    }
}
// @lc code=end

