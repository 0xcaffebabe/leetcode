/*
 * @lc app=leetcode.cn id=215 lang=java
 *
 * [215] 数组中的第K个最大元素
 * 
 * 39/39 cases passed (58 ms)
 * Your runtime beats 8.4 % of java submissions
 * Your memory usage beats 5.56 % of java submissions (50.2 MB)
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

