import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=856 lang=java
 *
 * [856] 括号的分数
 * 
 * 86/86 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 23.97 % of java submissions (39.6 MB)
 */

// @lc code=start
class Solution {
    public int scoreOfParentheses(String s) {
        LinkedList<Integer> st = new LinkedList<>();
        st.push(0);
        for(var i : s.toCharArray()) {
            if (i == '(') st.push(0);
            else {
                int v = st.pop();
                st.push(st.pop() + Math.max(1, 2 * v));
            }
        }
        // System.out.println(st);
        return st.poll();
    }
}
// @lc code=end

