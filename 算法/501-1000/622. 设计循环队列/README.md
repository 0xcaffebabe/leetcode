
<https://leetcode-cn.com/problems/design-circular-queue/>

```java
class MyCircularQueue {
    private int[] data;
    private int capcity;
    private int size;
    private int front = 1;
    private int rear = 1;

    public MyCircularQueue(int k) {
        this.data = new int[k + 1];
        this.capcity = k;
    }
    
    public boolean enQueue(int value) {
        if (isFull()) return false;
        data[rear % capcity] = value;
        rear++;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if (isEmpty()) return false;
        front++;
        size--;
        return true;
    }
    
    public int Front() {
        if (isEmpty()) return -1;
        return data[(front) % capcity];
    }
    
    public int Rear() {
        if (isEmpty()) return -1;
        return data[(rear-1) % capcity];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == capcity;
    }
}

```

time:4 beat:100

