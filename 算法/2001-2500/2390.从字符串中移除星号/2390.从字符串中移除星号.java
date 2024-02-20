/*
 * @lc app=leetcode.cn id=2390 lang=java
 * @lcpr version=
 *
 * [2390] 从字符串中移除星号
 * 
 * 65/65 cases passed (40 ms)
 * Your runtime beats 62.66 % of java submissions
 * Your memory usage beats 9.15 % of java submissions (48.2 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.LinkedList;

class Solution {
    public String removeStars(String s) {
        LinkedList<Character> stack = new LinkedList<>();
        for(var c: s.toCharArray()) {
            if(c == '*') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(var c: stack) 
            sb.append(c);
        sb.reverse();
        return sb.toString();
    }
}
// @lc code=end



/*
// @lcpr case=start
// "leet**cod*e"\n
// @lcpr case=end

// @lcpr case=start
// "erase*****"\n
// "l*"\n
// "l"\n
// "ll"\n
// "ll**"\n
// @lcpr case=end

 */

