
<https://leetcode-cn.com/problems/linked-list-cycle-ii/>

```java
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Map<ListNode, Boolean> map = new HashMap<>();
        while(head != null) {
            if (map.containsKey(head)) return head;
            map.put(head, true);
            head = head.next;
        }
        return null;
    }
}
```

time:4 beat:12

