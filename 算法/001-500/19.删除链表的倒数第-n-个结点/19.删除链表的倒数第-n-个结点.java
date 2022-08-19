/*
 * @lc app=leetcode.cn id=19 lang=java
 *
 * [19] 删除链表的倒数第 N 个结点
 * 
 * 208/208 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 96.69 % of java submissions (39.2 MB)
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
    private int cnt = 0;
    public ListNode removeNthFromEnd(ListNode head, int n) {
        remove(head, new int[]{n});
        if (cnt == n) return head.next;
        return head;
    }

    private void remove(ListNode head, int[] n) {
        if (head == null) return;
        cnt++;
        remove(head.next, n);
        if (n[0] == 0) {
            head.next = head.next.next;
        }
        n[0]--;
    }
}
// @lc code=end

