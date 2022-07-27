
<https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/>

递归到尾不断对计数器+1 判断计数器等于目标值 就返回当前遍历节点

```java
class Solution {

    private ListNode ret;

    public ListNode getKthFromEnd(ListNode head, int k) {
        getKthFromEnd0(head,k,new int[]{0});
        return ret;
    }
    private void getKthFromEnd0(ListNode head, int k,int[] arr) {
        if (head == null){
            return;
        }
        getKthFromEnd0(head.next,k,arr);
        arr[0]=arr[0]+1;
        if (arr[0] == k){
            ret = head;
        }
    }
}
```

耗时：0

