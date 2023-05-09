/*
 * @lc app=leetcode.cn id=剑指 Offer 31 lang=java
 * @lcpr version=21907
 *
 * [剑指 Offer 31] 栈的压入、弹出序列
 * 
 * 151/151 cases passed (1 ms)
 * Your runtime beats 96.42 % of java submissions
 * Your memory usage beats 5.01 % of java submissions (42.3 MB)
 */

// @lc code=start

import java.util.LinkedList;

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



/*
// @lcpr case=start
// [1,2,3,4,5]\n[4,5,3,2,1]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,4,5]\n[4,3,5,1,2]\n
// @lcpr case=end

 */

