
<https://leetcode-cn.com/problems/kth-node-from-end-of-list-lcci/>

```java
class Solution {

    private int ret;

    private int cnt;

    public int kthToLast(ListNode head, int k) {
        cnt = 0;
        process(head, k);
        return ret;
    }

    public void process(ListNode head, int k){
        if (head == null) {
            return;
        }
        process(head.next, k);
        cnt++;
        if (cnt == k) ret = head.val;
    }
}
```

time:0 beat:100


