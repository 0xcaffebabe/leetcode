/*
 * @lc app=leetcode.cn id=1768 lang=java
 *
 * [1768] 交替合并字符串
 * 
 * 108/108 cases passed (1 ms)
 * Your runtime beats 46.56 % of java submissions
 * Your memory usage beats 41.45 % of java submissions (39.8 MB)
 */

// @lc code=start
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int p = 0;
        int q = 0;
        StringBuilder sb = new StringBuilder();
        while(p < word1.length() && q < word2.length()) {
            sb.append(word1.charAt(p++));
            sb.append(word2.charAt(q++));
        }
        while(p < word1.length()) sb.append(word1.charAt(p++));
        while(q < word2.length()) sb.append(word2.charAt(q++));
        
        return sb.toString();
    }
}
// @lc code=end

