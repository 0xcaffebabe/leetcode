
<https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof>

```java
class Solution {
    public int[] reversePrint(ListNode head) {
        List<Integer> list = new ArrayList<>();
        walk(head,list);
        int [] ret = new int[list.size()];
        for (int i=0;i<ret.length;i++){
            ret[i]=list.get(i);
        }
        return ret;
    }
    private void walk(ListNode head,List<Integer> list){
        if (head == null){
            return;
        }
        walk(head.next,list);
        list.add(head.val);
    }
}
```

耗时：1

