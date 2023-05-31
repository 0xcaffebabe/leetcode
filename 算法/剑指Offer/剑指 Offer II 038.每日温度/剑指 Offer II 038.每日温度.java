/*
 * @lc app=leetcode.cn id=剑指 Offer II 038 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 038] 每日温度
 * 
 * 47/47 cases passed (20 ms)
 * Your runtime beats 90.7 % of java submissions
 * Your memory usage beats 35.94 % of java submissions (55.9 MB)
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



/*
// @lcpr case=start
// [73,74,75,71,69,72,76,73]\n
// @lcpr case=end

// @lcpr case=start
// [30,40,50,60]\n
// @lcpr case=end

// @lcpr case=start
// [30,60,90]\n
// @lcpr case=end

 */

