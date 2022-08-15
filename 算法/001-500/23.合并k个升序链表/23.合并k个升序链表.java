/*
 * @lc app=leetcode.cn id=23 lang=java
 *
 * [23] 合并K个升序链表
 * 
 * 133/133 cases passed (4 ms)
 * Your runtime beats 70.19 % of java submissions
 * Your memory usage beats 16 % of java submissions (43.7 MB)
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

