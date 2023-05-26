/*
 * @lc app=leetcode.cn id=剑指 Offer 30 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer 30] 包含min函数的栈
 * 
 * 19/19 cases passed (15 ms)
 * Your runtime beats 19.03 % of java submissions
 * Your memory usage beats 5.01 % of java submissions (46.1 MB)
 */

// @lc code=start
class MinStack {

    LinkedList<Integer> data = new LinkedList<>();

    private int min = Integer.MAX_VALUE;

    public MinStack() {

    }
    
    public void push(int val) {
        if (val < min) min = val;
        data.push(val);
    }
    
    public void pop() {
        int val = data.pop();
        if (val == min) {
            min = Integer.MAX_VALUE;
            for(int i : data) if (i < min) min = i;
        }
    }
    
    public int top() {
        return data.get(0);
    }
    
    public int min() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */
// @lc code=end



/*

// @lcpr case=start
// ["MinStack","push","push","push","min","pop","top","min"]\n
[[],[-2],[0],[-3],[],[],[],[]]
// @lcpr case=end

*/