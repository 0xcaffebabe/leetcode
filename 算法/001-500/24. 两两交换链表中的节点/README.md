
<https://leetcode-cn.com/problems/swap-nodes-in-pairs/>

```java
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null) return head;
        List<ListNode> nodeList = new ArrayList<>();
        while(head != null) {
            nodeList.add(head);
            head = head.next;
        }

        if (nodeList.size() < 2) {
            return nodeList.get(0);
        }

        for(int i = 1;i<nodeList.size();i+=2) {
            ListNode t = nodeList.get(i);
            nodeList.set(i, nodeList.get(i-1));
            nodeList.set(i-1, t);
        }
        head = nodeList.get(0);
        for(int i = 0;i<nodeList.size();i++){
            head.next = nodeList.get(i);
            head = head.next;
        }
        
        nodeList.get(nodeList.size()-1).next = null;
        return nodeList.get(0);
    }
}
```

time:0 beat: 100

