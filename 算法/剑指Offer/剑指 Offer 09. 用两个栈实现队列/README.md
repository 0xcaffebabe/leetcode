
<https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/>

使用一个辅助栈来实现FIFO的效果

```java
class CQueue {

    private LinkedList<Integer> main = new LinkedList<>();
    private LinkedList<Integer> help = new LinkedList<>();
    
    public void appendTail(int value) {
        main.push(value);
    }
    
    public int deleteHead() {
        if (main.isEmpty()) return -1;
        int ret = -1;
        while(!main.isEmpty()){
            ret = main.pop();
            help.push(ret);
        }
        help.pop();
        while(!help.isEmpty()){
            main.push(help.pop());
        }
        return ret;
    }
}
```

time:220 beat:11

