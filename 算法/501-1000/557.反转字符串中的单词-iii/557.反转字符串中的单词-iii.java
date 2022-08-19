/*
 * @lc app=leetcode.cn id=557 lang=java
 *
 * [557] 反转字符串中的单词 III
 * 
 * 29/29 cases passed (13 ms)
 * Your runtime beats 21.45 % of java submissions
 * Your memory usage beats 25.12 % of java submissions (42.1 MB)
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        if (s.length() == 0) return "";
        StringBuffer sb = new StringBuffer();
        for(int i =s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        String[] strs = sb.toString().split(" ");
        sb = new StringBuffer();
        for(int i = strs.length-1;i>=0;i--){
            sb.append(strs[i]);
            if (i != 0) sb.append(" ");
        }
        return sb.toString();
    }
}
// @lc code=end

