
<https://leetcode-cn.com/problems/palindrome-linked-list/>

```java
class Solution {
    private ListNode origin;
    public boolean isPalindrome(ListNode head) {
        origin = head;
        return travel(head);
    }
    private boolean travel(ListNode head){
        if (head == null) return true;
        if (!travel(head.next)){
            return false;
        }
        if (head.val == origin.val){
            origin = origin.next;
            return true;
        }else {
            return false;
        }
    }
}
```

耗时：2

