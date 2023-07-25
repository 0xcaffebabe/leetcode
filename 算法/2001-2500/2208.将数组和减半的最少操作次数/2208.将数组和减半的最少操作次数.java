/*
 * @lc app=leetcode.cn id=2208 lang=java
 * @lcpr version=21912
 *
 * [2208] 将数组和减半的最少操作次数
 * 
 * 62/62 cases passed (165 ms)
 * Your runtime beats 74.24 % of java submissions
 * Your memory usage beats 40.91 % of java submissions (56.5 MB)
 */

// @lc code=start

import java.util.PriorityQueue;

class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> q = new PriorityQueue<>((b, a) -> a.compareTo(b));
        double sum = 0;
        double target = 0;
        for(var i : nums) {
            sum += i;
            q.add((double) i);
        }
        target = sum / 2;
        int ans = 0;
        while(sum > target) {
            var i = q.poll() / 2;
            sum -= i;
            q.add(i);
            ans++;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [5,19,8,1]\n
// @lcpr case=end

// @lcpr case=start
// [3,8,20]\n
// [1]\n
// [18,22,62,61,1,88,17,98,38,32,51,57,7,29,40,61,62,13,89,41,73,85,88,60,59,76,71,76,76,41,29,43,19,9,79]\n
// [3,8,20,1,2,3,4,5,6,5,344,34,34,434,43,4,234,23,423,4,234,234,23,423,4]\n
// @lcpr case=end

 */

