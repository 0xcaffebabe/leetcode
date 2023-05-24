/*
 * @lc app=leetcode.cn id=剑指 Offer II 076 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 076] 数组中的第 k 大的数字
 * 
 * 32/32 cases passed (5 ms)
 * Your runtime beats 42.22 % of java submissions
 * Your memory usage beats 21.25 % of java submissions (41.9 MB)
 */

// @lc code=start
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> que = new PriorityQueue<>();
        for(var i : nums) {
            que.offer(i);
            if (que.size() > k) que.remove();
        }
        return que.peek();
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,2,1,5,6,4] \n2\n
// @lcpr case=end

// @lcpr case=start
// [3,2,3,1,2,4,5,5,6]\n4\n
// @lcpr case=end

 */

