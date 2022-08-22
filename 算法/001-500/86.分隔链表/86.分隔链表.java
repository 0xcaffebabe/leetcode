import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=86 lang=java
 *
 * [86] 分隔链表
 * 
 * 168/168 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 19.7 % of java submissions (41.2 MB)
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode prev = new ListNode();
        var oriPrev = prev;
        ListNode next = new ListNode();
        var oriNext = next;

        while (head != null) {
            if (head.val < x) {
                prev.next = new ListNode(head.val);
                prev = prev.next;
            } else {
                next.next = new ListNode(head.val);
                next = next.next;
            }
            head = head.next;
        }
        // prev.next = new ListNode(x);
        // prev = prev.next;
        prev.next = oriNext.next;
        return oriPrev.next;
    }
}
// @lc code=end
