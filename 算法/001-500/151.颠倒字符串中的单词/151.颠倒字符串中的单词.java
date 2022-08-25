import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=151 lang=java
 *
 * [151] 颠倒字符串中的单词
 * 
 * 58/58 cases passed (6 ms)
 * Your runtime beats 61.46 % of java submissions
 * Your memory usage beats 31.77 % of java submissions (41.5 MB)
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        LinkedList<String> stack = new LinkedList<>();
        for(var str: s.split(" ")) if (str.length() != 0) stack.push(str);
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) sb.append(stack.pop() + " ");
        sb.delete(sb.length() - 1, sb.length());
        return sb.toString();
    }
}
// @lc code=end

