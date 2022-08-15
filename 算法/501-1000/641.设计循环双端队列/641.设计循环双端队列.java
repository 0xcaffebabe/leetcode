/*
 * @lc app=leetcode.cn id=641 lang=java
 *
 * [641] 设计循环双端队列
 * 
 * 51/51 cases passed (4 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 19.42 % of java submissions (42.2 MB)
 */

// @lc code=start
class Node {
    int val;
    Node next;
    Node prev;
}
class MyCircularDeque {
    int size;
    int cap;
    Node head = new Node();
    Node tail = new Node();

    public MyCircularDeque(int k) {
        this.cap = k;
        head.val = -1;
        tail.val = -1;
        head.next = tail;
        tail.prev = head;
    }
    
    public boolean insertFront(int value) {
        if (size >= cap) return false;
        var front = new Node();
        front.val = value;
        front.next = head.next;
        front.next.prev = front;
        front.prev = head;

        head.next = front;
        size++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if (size >= cap) return false;
        var rear = new Node();
        rear.val = value;
        rear.prev = tail.prev;
        rear.prev.next = rear;
        rear.next = tail;

        tail.prev = rear;
        size++;
        return true;
    }
    
    public boolean deleteFront() {
        if (size <= 0) return false;
        head.next = head.next.next;
        head.next.prev = head;
        size--;
        return true;
    }
    
    public boolean deleteLast() {
        if (size <= 0) return false;
        tail.prev = tail.prev.prev;
        tail.prev.next = tail;
        size--;
        return true;
    }
    
    public int getFront() {
        return head.next.val;
    }
    
    public int getRear() {
        return tail.prev.val;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == cap;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */
// @lc code=end

