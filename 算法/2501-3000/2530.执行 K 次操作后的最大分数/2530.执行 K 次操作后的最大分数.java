/*
 * @lc app=leetcode.cn id=2530 lang=java
 * @lcpr version=
 *
 * [2530] 执行 K 次操作后的最大分数
 * 
 * 39/39 cases passed (145 ms)
 * Your runtime beats 17.44 % of java submissions
 * Your memory usage beats 15.12 % of java submissions (59.4 MB)
 */

// @lc code=start

import java.util.PriorityQueue;

class Solution {
    public long maxKelements(int[] nums, int k) {
        long ans = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b) -> b - a);
        for(var i : nums) q.offer(i);
        for(int i = 0; i < k; i++) {
            var val = q.poll();
            ans += val;
            q.offer((int)Math.ceil(val / 3d));
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [10,10,10,10,10]\n5\n
// @lcpr case=end

// @lcpr case=start
// [1,10,3,3,3]\n3\n
// @lcpr case=end

 */

