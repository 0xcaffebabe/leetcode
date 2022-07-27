
<https://leetcode-cn.com/problems/convert-binary-number-in-a-linked-list-to-integer/>

```java
class Solution {
    public int getDecimalValue(ListNode head) {
        LinkedList<Integer> s = new LinkedList<>();
        while(head != null) {
            s.push(head.val);
            head = head.next;
        }
        int ret = 0;
        int i = 0;
        while(!s.isEmpty()){
            ret += s.pop() * Math.pow(2,i++);
        }
        return ret;
    }

}
```

耗时：1

