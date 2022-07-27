
<https://leetcode-cn.com/problems/delete-node-in-a-linked-list/>

```java
class Solution {
    public void deleteNode(ListNode node) {
        ListNode previous = null;
        while(node != null){
            if (node.next != null) node.val = node.next.val;
            else previous.next = null;
            
            previous = node;
            node = node.next;
        }
    }
}
```

耗时：0

