/*
 * @lc app=leetcode.cn id=2335 lang=java
 * @lcpr version=
 *
 * [2335] 装满杯子需要的最短总时长
 * 
 * 280/280 cases passed (2 ms)
 * Your runtime beats 20.7 % of java submissions
 * Your memory usage beats 11.01 % of java submissions (39.5 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.PriorityQueue;

class Solution {
    public int fillCups(int[] amount) {
        int ans = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b) -> b - a);
        if (amount[0] > 0) q.offer(amount[0]);
        if (amount[1] > 0) q.offer(amount[1]);
        if (amount[2] > 0) q.offer(amount[2]);

        while(!q.isEmpty()) {
            var a = q.poll();
            a--;
            if (!q.isEmpty()) {
                var b = q.poll();
                b--;
                if (b > 0) q.offer(b);
            }
            if (a > 0) q.offer(a);
            ans++;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,4,2]\n
// @lcpr case=end

// @lcpr case=start
// [5,4,4]\n
// @lcpr case=end

// @lcpr case=start
// [5,0,0]\n
// [0,0,0]\n
// [100,100,100]\n
// [100,99,98]\n
//  [2, 3, 1]\n
//  [5, 2, 4]\n
// [3, 1, 5]
// @lcpr case=end

 */

