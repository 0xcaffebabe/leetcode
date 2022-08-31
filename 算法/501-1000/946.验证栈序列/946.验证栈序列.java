import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=946 lang=java
 *
 * [946] 验证栈序列
 * 
 * 151/151 cases passed (1 ms)
 * Your runtime beats 95.71 % of java submissions
 * Your memory usage beats 36.4 % of java submissions (41.3 MB)
 */

// @lc code=start
class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        LinkedList<Integer> stack = new LinkedList<>();
        int p = 0;
        int q = 0;
        int n = pushed.length;
        while(p < n && q < n) {
            if (stack.isEmpty() || stack.peek() != popped[q]) {
                stack.push(pushed[p]);
                p++;
            } else if (stack.peek() == popped[q]) {
                stack.pop();
                q++;
            }
            // System.out.println(stack);
            // System.out.println(q);
            // System.out.println(p);
        }
        while(!stack.isEmpty() && q < n) {
            if (stack.peek() == popped[q]) stack.pop();
            q++;
        }
        return stack.isEmpty();
    }
}
// @lc code=end

