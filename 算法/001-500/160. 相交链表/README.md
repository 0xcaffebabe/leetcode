
<https://leetcode-cn.com/problems/intersection-of-two-linked-lists/>

```java
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Map<ListNode,Boolean> map = new HashMap<>();
        while(headA != null){
            map.put(headA, true);
            headA = headA.next;
        }
        while(headB != null){
            if (map.containsKey(headB)) return headB;
            headB = headB.next;
        }
        return null;
    }
}
```

time:9 beat:15

