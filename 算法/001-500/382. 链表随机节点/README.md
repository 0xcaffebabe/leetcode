
<https://leetcode-cn.com/problems/linked-list-random-node/>

```java
class Solution {

    private List<Integer> list = new ArrayList<>(16);

    public Solution(ListNode head) {
        while(head != null) {
            list.add(head.val);
            head = head.next;
        }
    }
    
    public int getRandom() {
        int i = new Random().nextInt(list.size());
        return list.get(i);
    }
}
```

time:11 beat:84

