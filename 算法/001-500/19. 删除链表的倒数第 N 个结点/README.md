
<https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/>

```java
class Solution {
    private int cnt = 0;
    public ListNode removeNthFromEnd(ListNode head, int n) {
        remove(head, new int[]{n});
        if (cnt == n) return head.next;
        return head;
    }

    private void remove(ListNode head, int[] n) {
        if (head == null) return;
        cnt++;
        remove(head.next, n);
        if (n[0] == 0) {
            head.next = head.next.next;
        }
        n[0]--;
    }
}
```

time:0 beat:100

