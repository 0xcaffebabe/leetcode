
<https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/>

给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次

- 解法

遍历链表，如果发现当前节点等于后继节点，则将当前节点的后继修改为后继节点的后继
当当前节点或者后继节点为null，停止遍历

```java
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode origin = head;
        while(head != null && head.next != null) {
            if (head.val == head.next.val) {
                head.next = head.next.next;
                continue;
            }
            head = head.next;
        }
        return origin;
    }
}
```

耗时：0ms

