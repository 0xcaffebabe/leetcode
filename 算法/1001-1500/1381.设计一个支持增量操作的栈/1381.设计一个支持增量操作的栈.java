/*
 * @lc app=leetcode.cn id=1381 lang=java
 *
 * [1381] 设计一个支持增量操作的栈
 * 
 * 34/34 cases passed (4 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 42.67 % of java submissions (42.3 MB)
*/

// @lc code=start
class CustomStack {
    private int[] data;
    private int pos;
    private int cap;
    private int size;
    public CustomStack(int maxSize) {
        data = new int[maxSize + 1];
        cap = maxSize;
    }
    
    public void push(int x) {
        if (pos >= cap) return;
        data[pos++] = x;
        size++;
    }
    
    public int pop() {
        if (pos == 0) return -1;
        size--;
        return data[--pos];
    }
    
    public void increment(int k, int val) {
        int n = Math.min(k, size);
        for(int i = 0; i < n; i++) 
            data[i] += val;
        
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
// @lc code=end

