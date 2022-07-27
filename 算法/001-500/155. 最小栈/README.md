
<https://leetcode-cn.com/problems/min-stack/>

```java
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
    
    public int getMin() {
        return min;
    }
}
```

time:4 beat:99

