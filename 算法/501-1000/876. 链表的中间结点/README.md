
<https://leetcode-cn.com/problems/middle-of-the-linked-list/>

```java
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode[] map = new ListNode[101];
        int i = 1;
        while(head != null){
            map[i]=head;
            i++;
            head = head.next;
        }
        if (i % 2 !=0) return map[i/2+1];
        else return map[i/2];
    }
}
```

耗时：0

