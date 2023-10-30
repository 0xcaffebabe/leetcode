/*
 * @lc app=leetcode.cn id=2558 lang=java
 * @lcpr version=
 *
 * [2558] 从数量最多的堆取走礼物
 * 
 * 102/102 cases passed (5 ms)
 * Your runtime beats 76.85 % of java submissions
 * Your memory usage beats 39.11 % of java submissions (40.2 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.PriorityQueue;

class Solution {
    public long pickGifts(int[] gifts, int k) {
        long sum = 0;
        long d = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b) -> b - a);
        for(var i : gifts) {
            sum += i;
            q.offer(i);
        }
        while(k > 0) {
            var i = q.poll();
            var j = (int)Math.sqrt(i);
            d += i - j;
            q.offer(j);
            k--;
        }
        
        return sum - d;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [25,64,9,4,100]\n4\n
// @lcpr case=end

// @lcpr case=start
// [1,1,1,1]\n4\n
// [1]\n4\n
// @lcpr case=end

 */

