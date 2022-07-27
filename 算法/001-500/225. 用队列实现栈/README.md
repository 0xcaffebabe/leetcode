
<https://leetcode-cn.com/problems/implement-stack-using-queues/>

```java
class MyStack {

    private LinkedList<Integer> q1 = new LinkedList<>();
    private LinkedList<Integer> q2 = new LinkedList<>();
    private int next = 0;
    
    public void push(int x) {
        q1.add(x);
        next = x;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int size = q1.size();
        int oldNext = next;
        for(int i = 0;i<size;i++){
            int x = q1.remove();
            if (i == size - 2) next = x;
            if (i != size - 1) q2.add(x);
        }
        var t = q1;
        q1 = q2;
        q2 = t;
        return oldNext;
    }
    
    public int top() { return next; }
    
    public boolean empty() { return q1.isEmpty(); }
}
```

耗时：0

