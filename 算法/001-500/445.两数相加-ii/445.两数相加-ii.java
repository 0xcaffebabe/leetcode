import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=445 lang=java
 *
 * [445] 两数相加 II
 * 
 * 1563/1563 cases passed (2 ms)
 * Your runtime beats 71.42 % of java submissions
 * Your memory usage beats 88.26 % of java submissions (41.2 MB)
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);
        ListNode dumy = new ListNode();
        var ori = dumy;
        int adi = 0;
        while(l1 != null && l2 != null) {
            int c1 = l1.val;
            int c2 = l2.val;
            if (c1 + c2 + adi >= 10) {
                dumy.next = new ListNode(c1 + c2 + adi - 10);
                adi = 1;
            } else {
                dumy.next = new ListNode(c1 + c2 + adi);
                adi = 0;
            }
            dumy = dumy.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null) {
            int c1 = l1.val;
            if (c1 + adi >= 10) {
                dumy.next = new ListNode(c1 + adi - 10);
                adi = 1;
            } else {
                dumy.next = new ListNode(c1 + adi);
                adi = 0;
            }
            dumy = dumy.next;
            l1 = l1.next;
        }
        while(l2 != null) {
            int c2 = l2.val;
            if (c2 + adi >= 10) {
                dumy.next = new ListNode(c2 + adi - 10);
                adi = 1;
            } else {
                dumy.next = new ListNode(c2 + adi);
                adi = 0;
            }
            dumy = dumy.next;
            l2 = l2.next;
        }
        if (adi == 1) dumy.next = new ListNode(1);
        else dumy.next = null;
        return reverse(ori.next);
    }

    ListNode reverse(ListNode head) {
        LinkedList<ListNode> stack = new LinkedList<>();
        while(head != null) {
            stack.push(head);
            head = head.next;
        }
        ListNode dumy = new ListNode();
        var ori = dumy;
        while(!stack.isEmpty()) {
            dumy.next = stack.pop();
            dumy = dumy.next;
        }
        dumy.next = null;
        return ori.next;
    }
}
// @lc code=end

