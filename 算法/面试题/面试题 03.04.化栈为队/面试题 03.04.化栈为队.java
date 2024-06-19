/*
 * @lc app=leetcode.cn id=面试题 03.04 lang=java
 * @lcpr version=
 *
 * [面试题 03.04] 化栈为队
 * 
 * 17/17 cases passed (10 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 32.25 % of java submissions (40.4 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.LinkedList;

class MyQueue {

    LinkedList<Integer> s1 = new LinkedList<>();
    LinkedList<Integer> s2 = new LinkedList<>();
    int front;

    public MyQueue() {

    }
    
    public void push(int x) {
        while(!s2.isEmpty()) s1.push(s2.pop());
        s1.push(x);
    }
    
    public int pop() {
        while(!s1.isEmpty()) s2.push(s1.pop());
        return s2.pop();
    }
    
    public int peek() {
        while(!s1.isEmpty()) s2.push(s1.pop());
        return s2.peek();
    }
    
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
// @lc code=end


/*
// @lcpr case=start
// ["MyQueue","push","push","peek","pop","empty"]\n[[],[1],[2],[],[],[]]
// @lcpr case=end

 */
