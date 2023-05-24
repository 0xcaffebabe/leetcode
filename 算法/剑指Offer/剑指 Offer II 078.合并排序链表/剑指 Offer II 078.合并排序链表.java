/*
 * @lc app=leetcode.cn id=剑指 Offer II 078 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 078] 合并排序链表
 * 
 * 133/133 cases passed (4 ms)
 * Your runtime beats 65.8 % of java submissions
 * Your memory usage beats 92.79 % of java submissions (42.3 MB)
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> que = new PriorityQueue<>((a, b) -> a.val - b.val);
        for(var node: lists) if (node != null) que.offer(node);
        ListNode ori = new ListNode();
        ListNode head = ori;
        while(!que.isEmpty()) {
            var node = que.poll();
            head.next = node;
            head = head.next;
            if (head.next != null) que.offer(head.next);
        }
        return ori.next;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,4,5],[1,3,4],[2,6]]\n
// @lcpr case=end

// @lcpr case=start
// []\n
// @lcpr case=end

// @lcpr case=start
// [[]]\n
// @lcpr case=end

 */

