/*
 * @lc app=leetcode.cn id=328 lang=java
 *
 * [328] 奇偶链表
 * 
 * 70/70 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 76.36 % of java submissions (40.8 MB)
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
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode();
        var oriOdd = odd;
        ListNode eve = new ListNode();
        var oriEve = eve;
        int pos = 0;
        while(head != null) {
            if (pos++ % 2 == 1) {
                eve.next = head;
                eve = eve.next;
            } else {
                odd.next = head;
                odd = odd.next;
            }
            head = head.next;
        }
        odd.next = oriEve.next;
        eve.next = null;
        return oriOdd.next;
    }
}
// @lc code=end

