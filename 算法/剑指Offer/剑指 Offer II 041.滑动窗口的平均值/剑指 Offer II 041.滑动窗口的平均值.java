/*
 * @lc app=leetcode.cn id=剑指 Offer II 041 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 041] 滑动窗口的平均值
 * 
 * 11/11 cases passed (38 ms)
 * Your runtime beats 52.28 % of java submissions
 * Your memory usage beats 6.04 % of java submissions (47.2 MB)
 */

// @lc code=start

import java.util.LinkedList;

class MovingAverage {
    int size;
    LinkedList<Integer> q = new LinkedList<>();
    int sum = 0;
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        this.size = size;
    }
    
    public double next(int val) {
        sum += val;
        if (q.size() >= size) sum -= q.pop();
        q.offer(val);
        return sum * 1d / q.size();
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
// @lc code=end



/*
// @lcpr case=start
// ["MovingAverage", "next", "next", "next", "next"]\n[[3], [1], [10], [3], [5]]\n
// ["MovingAverage", "next", "next", "next", "next"]\n[[3000], [1], [10], [3], [5]]\n
// @lcpr case=end

 */

