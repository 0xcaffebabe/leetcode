/*
 * @lc app=leetcode.cn id=1021 lang=java
 *
 * [1021] 删除最外层的括号
 * 
 * 59/59 cases passed (5 ms)
 * Your runtime beats 52.73 % of java submissions
 * Your memory usage beats 33.36 % of java submissions (41.3 MB)
 */

// @lc code=start
class Solution {
    LinkedList<Character> stack = new LinkedList<>();

    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        for(var i : s.toCharArray()) {
            if ('(' == i) {
                if (stack.size() >= 1) sb.append(i);
                stack.push('(');
            } else {
                if (stack.size() > 1) sb.append(i);
                stack.pop();
            }
        }
        return sb.toString();
    }
}
// @lc code=end

