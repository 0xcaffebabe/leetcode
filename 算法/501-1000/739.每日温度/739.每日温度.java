import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=739 lang=java
 *
 * [739] 每日温度
 * 
 * 47/47 cases passed (21 ms)
 * Your runtime beats 93.65 % of java submissions
 * Your memory usage beats 22.5 % of java submissions (56.8 MB)
 */

// @lc code=start
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        LinkedList<Integer> s = new LinkedList<>();
        int[] ans = new int[temperatures.length];
        for(int i = 0; i <temperatures.length; i++) {
            int t = temperatures[i];
            // 栈顶温度小于当前温度
            // 弹出来的位置的下一个最高温就是当前温度
            while(!s.isEmpty() && t > temperatures[s.peek()]) {
                int index = s.pop();
                ans[index] = i - index;
            }
            s.push(i);
        }
        return ans;
    }
}
// @lc code=end

