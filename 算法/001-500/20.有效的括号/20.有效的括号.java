/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 * 
 * 92/92 cases passed (1 ms)
 * Your runtime beats 98.93 % of java submissions
 * Your memory usage beats 48.09 % of java submissions (39.6 MB)
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        LinkedList<Character> stack = new LinkedList<>();
        Map<Character,Character> map = new HashMap<>();
        map.put('{','}');
        map.put('[',']');
        map.put('(',')');
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            }else {
                if (stack.size() == 0) {
                    return false;
                }
                if (c !=map.get(stack.pop())){
                    return false;
                }
            }
        }
        return stack.size() == 0;
    }
}
// @lc code=end

