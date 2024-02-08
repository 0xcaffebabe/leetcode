/*
 * @lc app=leetcode.cn id=921 lang=java
 * @lcpr version=
 *
 * [921] 使括号有效的最少添加
 * 
 * 115/115 cases passed (1 ms)
 * Your runtime beats 32.65 % of java submissions
 * Your memory usage beats 5.19 % of java submissions (40.7 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.LinkedList;

class Solution {
    public int minAddToMakeValid(String s) {
        LinkedList<Character> stack = new LinkedList<>();
        for(var c: s.toCharArray()) {
            if (c == '(') stack.push('(');
            else if (stack.isEmpty()) stack.push(')');
            else if (stack.peek() == '(') stack.pop();
            else stack.push(')');
        }
        return stack.size();
    }
}
// @lc code=end



/*
// @lcpr case=start
// "())"\n
// "()))(("\n
// @lcpr case=end

// @lcpr case=start
// "((("\n
// "((())"\n
// "((()))"\n
// "("\n
// "(("\n
// @lcpr case=end

 */

