import java.util.PriorityQueue;

/*
 * @lc app=leetcode.cn id=703 lang=java
 *
 * [703] 数据流中的第 K 大元素
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

