/*
 * @lc app=leetcode.cn id=剑指 Offer II 036 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 036] 后缀表达式
 * 
 * 20/20 cases passed (6 ms)
 * Your runtime beats 54.34 % of java submissions
 * Your memory usage beats 5.07 % of java submissions (42.3 MB)
 */

// @lc code=start
class Solution {
    public int evalRPN(String[] tokens) {
        LinkedList<Integer> s = new LinkedList<>();
        for(String i: tokens) {
            if (i.equals("+")){
                int[] nums = pop2(s);
                s.push(nums[1] + nums[0]);
            }else if (i.equals("-")) {
                int[] nums = pop2(s);
                s.push(nums[1] - nums[0]);
            }else if (i.equals("*")) {
                int[] nums = pop2(s);
                s.push(nums[1] * nums[0]);
            } else if (i.equals("/")) {
                int[] nums = pop2(s);
                s.push((int)(nums[1] / nums[0]));
            }else {
                s.push(Integer.parseInt(i));
            }
        }
        return s.pop();
    }

    private int[] pop2(LinkedList<Integer> s) {
        return new int[]{s.pop(), s.pop()};
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["2","1","+","3","*"]\n
// @lcpr case=end

// @lcpr case=start
// ["4","13","5","/","+"]\n
// @lcpr case=end

// @lcpr case=start
// ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]\n
// @lcpr case=end

 */

