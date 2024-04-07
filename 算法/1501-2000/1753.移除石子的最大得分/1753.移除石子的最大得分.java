/*
 * @lc app=leetcode.cn id=1753 lang=java
 * @lcpr version=
 *
 * [1753] 移除石子的最大得分
 * 
 * 96/96 cases passed (71 ms)
 * Your runtime beats 7.44 % of java submissions
 * Your memory usage beats 6.61 % of java submissions (43.6 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.PriorityQueue;

class Solution {
    public int maximumScore(int a, int b, int c) {
        PriorityQueue<Integer> q = new PriorityQueue<>((x1,x2) -> x2 - x1);
        q.offer(a);
        q.offer(b);
        q.offer(c);
        int ans = 0;
        while(q.size() >= 2) {
            var x1 = q.poll();
            var x2 = q.poll();
            x1--;
            x2--;
            ans++;
            if (x1 > 0) q.offer(x1);
            if (x2 > 0) q.offer(x2);
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 2\n4\n6\n
// @lcpr case=end

// @lcpr case=start
// 4\n4\n6\n
// @lcpr case=end

// @lcpr case=start
// 1\n8\n8\n
// 100000\n100000\n100000\n
// 1\n1\n1\n
// @lcpr case=end

 */

