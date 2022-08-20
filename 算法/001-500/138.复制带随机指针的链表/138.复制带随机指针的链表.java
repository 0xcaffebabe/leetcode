import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=138 lang=java
 *
 * [138] 复制带随机指针的链表
 * 
 * 19/19 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 54.15 % of java submissions (41 MB)
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        // 用来存储原始节点的下标
        Map<Node, Integer> map = new HashMap<>();
        // 原始节点
        List<Node> list1 = new ArrayList<>();
        // 拷贝节点
        List<Node> list2 = new ArrayList<>();
        Node ori = head;
        int pos = 0;
        while(head != null) {
            list1.add(head);
            var copyNode = new Node(head.val);
            list2.add(copyNode);
            map.put(head, pos);
            head = head.next;
            pos++;
        }
        Node ans = new Node(0);
        Node oriAns = ans;
        for(int i = 0; i < list2.size(); i++) {
            ans.next = list2.get(i);
            ans = ans.next;
            var oriRnd = list1.get(i).random;
            // 根据原始随机指针下标从拷贝节点列表找到对应下表的拷贝节点
            if (oriRnd != null) ans.random = list2.get(map.get(oriRnd));
        }
        return oriAns.next;
    }
}
// @lc code=end

