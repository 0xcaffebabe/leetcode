/*
 * @lc app=leetcode.cn id=148 lang=java
 *
 * [148] 排序链表
 * 
 * 30/30 cases passed (11 ms)
 * Your runtime beats 52.28 % of java submissions
 * Your memory usage beats 88.97 % of java submissions (48.9 MB)
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
    public ListNode sortList(ListNode head) {
        return sort(head, null);
    }

    ListNode sort(ListNode p, ListNode q) {
        if (p == null) return p;
        if (p.next == q) {
            p.next = null;
            return p;
        }

        ListNode slow = p, fast = p;
        while (fast != q) {
            // slow走一步 fast走两步
            slow = slow.next;
            fast = fast.next;
            if (fast != q) fast = fast.next;
        }
        
        var mid = slow;
        var list1 = sort(p, mid);
        var list2 = sort(mid, q);
        return merge(list1, list2);
    }
    
    ListNode merge(ListNode p, ListNode q) {
        var dummy = new ListNode();
        var head = dummy;
        while(p != null && q != null) {
            if (p.val <= q.val) {
                head.next = p;
                p = p.next;
            }else {
                head.next = q;
                q = q.next;
            }
            head = head.next;
        }
        if (p != null) head.next = p;
        else if (q != null) head.next = q;
        return dummy.next;
    }
}
// @lc code=end

