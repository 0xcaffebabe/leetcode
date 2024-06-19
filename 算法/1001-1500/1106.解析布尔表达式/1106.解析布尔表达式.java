/*
 * @lc app=leetcode.cn id=1106 lang=java
 * @lcpr version=
 *
 * [1106] 解析布尔表达式
 * 
 * 75/75 cases passed (7 ms)
 * Your runtime beats 76.06 % of java submissions
 * Your memory usage beats 26.76 % of java submissions (43.4 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.LinkedList;

class Solution {
    public boolean parseBoolExpr(String expression) {
        LinkedList<Character> s = new LinkedList<>();
        for(var c: expression.toCharArray()) {
            if (c == ',') continue;
            if (c != ')') {
                s.push(c);
                continue;
            }
            int t = 0;
            int f = 0;
            while(s.peek() != '(') {
                var val = s.pop();
                if (val == 't') t++;
                else f++;
            }
            s.pop(); // pop (
            var op = s.pop();
            var ans = 't';

            if (op == '!') ans = t > 0 ? 'f': 't';
            if (op == '&') ans = f > 0 ? 'f': 't';
            if (op == '|') ans = t > 0 ? 't': 'f';
            
            s.push(ans);
        }
        return s.peek() == 't';
    }
}
// @lc code=end



/*
// @lcpr case=start
// "&(|(f))"\n
// "!(&(|(f,t,f)))"\n
// @lcpr case=end

// @lcpr case=start
// "|(f,f,f,t)"\n
// @lcpr case=end

// @lcpr case=start
// "!(&(f,t))"\n
// "t"\n
// "f"\n
// "!(t)"\n
// "!(f)"\n
// "&(t,f)"\n
// "|(t,f)"\n
// "&(|(t,f),!(f))"\n
// "|(&(t,f),!(t))"\n
// "&(!(f),|(t,f,!(f)))"\n
// "|(&(t,t,t),&(f,t))"\n
// @lcpr case=end

 */

