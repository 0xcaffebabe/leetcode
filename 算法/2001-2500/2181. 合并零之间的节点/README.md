
<https://leetcode.cn/problems/merge-nodes-in-between-zeros/>

```java
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode node = new ListNode(0);
        ListNode origin = node;
        while(head != null) {
            node.val += head.val;
            head = head.next;
            if (head != null && head.val == 0 && head.next != null && head.next.val != 0) {
                node.next = new ListNode(0);
                node = node.next;
            }
        }
        return origin;
    }
}
```

time:8 beat:13