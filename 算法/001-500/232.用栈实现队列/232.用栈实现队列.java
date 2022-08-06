import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=232 lang=java
 *
 * [232] 用栈实现队列
 * 
 * 22/22 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 47.73 % of java submissions (39.3 MB)
 */

// @lc code=start
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

