
<https://leetcode-cn.com/problems/reverse-linked-list/>

```java
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        LinkedList<Integer> stack = new LinkedList<>();
        while(head != null){
            stack.push(head.val);
            head = head.next;
        }
        ListNode root = new ListNode();
        ListNode origin = root;
        while(!stack.isEmpty()){
            root.val = stack.pop();
            if (!stack.isEmpty()){
                root.next = new ListNode();
                root = root.next;
            }
        }
        return origin;
    }
}
```

耗时：0

