
给定一个链表，判断链表中是否有环。

<https://leetcode-cn.com/problems/linked-list-cycle/>

- 解法

使用map存储遍历过的node
对List进行遍历，发现存在过的node即存在环

```java
public class Solution {
    public boolean hasCycle(ListNode head) {
        Map<ListNode,Boolean> map = new HashMap();
        while(head != null){
            if (map.containsKey(head)){
                return true;
            }
            map.put(head,true);
            head = head.next;
        }
        return false;
    }
}
```

耗时：5ms

