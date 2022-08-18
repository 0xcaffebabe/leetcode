import java.util.Arrays;
import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=503 lang=java
 *
 * [503] 下一个更大元素 II
 * 
 * 223/223 cases passed (5 ms)
 * Your runtime beats 92.8 % of java submissions
 * Your memory usage beats 56.77 % of java submissions (42.7 MB)
 */

// @lc code=start
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        LinkedList<Integer> stk = new LinkedList<>();
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        for(int i = 0; i < 2 * n - 1; i++) {
            // 栈顶元素比当前元素小 弹掉 弹到栈顶比当前元素大
            // 同时被弹掉的那些元素的下一个最大元素就是当前元素
            while(!stk.isEmpty() && nums[stk.peek()] < nums[i % n]) ans[stk.pop()] = nums[i % n];
            stk.push(i % n);
        }

        return ans;
    }
}
// @lc code=end

