
<https://leetcode-cn.com/problems/reverse-linked-list-ii/>

```java
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) return head;
        ListNode originHead = head;
        List<Integer> list = new ArrayList<>(right - left + 2);
        int counter = 1;
        while(head != null) {
            if (counter >= left && counter <= right) list.add(head.val);
            head = head.next;
            counter++;
        }

        head = originHead;
        counter = 1;
        while(head != null) {
            if (counter >= left && counter <= right) {
                int index = list.size () - (counter - left) - 1;
                head.val = list.get(index);
            }
            head = head.next;
            counter++;
        }
        return originHead;
    }
}
```

time:0 beat:100

