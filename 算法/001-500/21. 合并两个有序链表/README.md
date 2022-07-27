
输入：1->2->4, 1->3->4
输出：1->1->2->3->4->4

- 解法

当两个指针都不为空时，则判断哪个指针的值比较小，
将较小的值存入结果，结果的指针与比较小的指针后移

如果只有一个指针不为空，则不断对该指针存入结果，并且将结果与该指针后移

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        ListNode node = new ListNode();
        ListNode ret = node;
        while(l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                node.val = l1.val;
                l1 = l1.next;
            }else {
                node.val = l2.val;
                l2 = l2.next;
            }
            node.next = new ListNode();
            node = node.next;
        }
        ListNode tl = null;
        if (l1 == null) {
           tl = l2;
        } else if (l2 == null) {
            tl = l1;
        }
        while (tl != null) {
            node.val = tl.val;
            tl = tl.next;
            if (tl != null) {
                node.next = new ListNode();
                node = node.next;
            }
        }
        return ret;
    }
}
```

耗时：1ms

