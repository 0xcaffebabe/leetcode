
<https://leetcode-cn.com/problems/delete-middle-node-lcci/>

```java
class Solution {
    public void deleteNode(ListNode node) {
        ListNode prev = null;
        while(node != null){
            if (prev != null) prev.val = node.val;
            if (node.next == null) break;
            prev = node;
            node = node.next;
        }
        if (prev != null) prev.next = null;
    }
}
```

time:0 beat: 100

