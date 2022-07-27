
<https://leetcode-cn.com/problems/number-of-recent-calls/>

```java
class RecentCounter {

    private LinkedList<Integer> s = new LinkedList<>();

    public RecentCounter() { }
    
    public int ping(int t) {
        s.add(t);
        while(!s.isEmpty()){
            if(s.peekLast() - s.peekFirst() <= 3000){
                break;
            }else{
                s.pop();
            }
        }
        return s.size();
    }
}
```

耗时：26

