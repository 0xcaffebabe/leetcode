/*
 * @lc app=leetcode.cn id=剑指 Offer 35 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer 35] 复杂链表的复制
 * 
 * 18/18 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 5.04 % of java submissions (42.3 MB)
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



/*
// @lcpr case=start
// [[7,null],[13,0],[11,4],[10,2],[1,0]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,1],[2,1]]\n
// @lcpr case=end

// @lcpr case=start
// [[3,null],[3,0],[3,null]]\n
// @lcpr case=end

// @lcpr case=start
// []\n
// @lcpr case=end

 */

