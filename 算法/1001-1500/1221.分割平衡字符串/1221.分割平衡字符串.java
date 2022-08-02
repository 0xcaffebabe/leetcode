/*
 * @lc app=leetcode.cn id=1221 lang=java
 *
 * [1221] 分割平衡字符串
 * 
 * 40/40 cases passed (1 ms)
 * Your runtime beats 14.93 % of java submissions
 * Your memory usage beats 51.07 % of java submissions (39.3 MB)
 */

// @lc code=start
class Solution {
    public int balancedStringSplit(String s) {
        LinkedList<Character> stack = new LinkedList<>();
        int ans = 0;
        for(var i : s.toCharArray()) {
            if (stack.isEmpty() || i == stack.peek()) {
                stack.push(i);
            }else {
                stack.pop();
                if (stack.size() == 0) ans++;
            }
        }
        return ans;
    }
}
// @lc code=end

