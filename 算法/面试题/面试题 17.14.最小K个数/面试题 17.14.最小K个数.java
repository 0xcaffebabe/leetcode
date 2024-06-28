/*
 * @lc app=leetcode.cn id=面试题 17.14 lang=java
 * @lcpr version=
 *
 * [面试题 17.14] 最小K个数
 * 
 * 29/29 cases passed (19 ms)
 * Your runtime beats 44.32 % of java submissions
 * Your memory usage beats 35.32 % of java submissions (50.1 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.PriorityQueue;

class Solution {
    public int[] smallestK(int[] arr, int k) {
        int[] ans = new int[k];
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> a - b);
        for(var i: arr) q.offer(i);
        k = Math.min(k, arr.length);
        for(int i = 0; i < k; i++) ans[i] = q.poll();
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,3,5,7,2,4,6,8]\n4\n
// [1]\n1\n
// @lcpr case=end

 */

