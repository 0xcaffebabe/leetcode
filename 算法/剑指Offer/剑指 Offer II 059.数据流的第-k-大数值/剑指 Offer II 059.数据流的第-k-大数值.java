/*
 * @lc app=leetcode.cn id=剑指 Offer II 059 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 059] 数据流的第 K 大数值
 * 12ms
 */

// @lc code=start
class KthLargest {

    PriorityQueue<Integer> que = new PriorityQueue<>();

    int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for(var i : nums) add(i);
    }
    
    public int add(int val) {
        que.offer(val);
        if (que.size() > k) que.remove();
        return que.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
// @lc code=end



/*
// @lcpr case=start
// ["KthLargest", "add", "add", "add", "add", "add"][[3, [4, 5, 8, 2]], [3], [5], [10], [9], [4]]\n
// @lcpr case=end

 */

