/*
 * @lc app=leetcode.cn id=203 lang=java
 *
 * [203] 移除链表元素
 * 
 * 66/66 cases passed (1 ms)
 * Your runtime beats 48.94 % of java submissions
 * Your memory usage beats 68.74 % of java submissions (42.1 MB)
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
    public ListNode removeElements(ListNode h, int val) {
        var head = new ListNode();
        var orgi = head;
        var pre = orgi;
        head.next = h;
        head = head.next;

        while(head != null) {
            if (head.val == val) pre.next = head.next;
            else pre = head;
            
            head = head.next;
        }
        return orgi.next;
    }
}
// @lc code=end

