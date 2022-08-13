import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=2130 lang=java
 *
 * [2130] 链表最大孪生和
 * 
 * 46/46 cases passed (17 ms)
 * Your runtime beats 13.83 % of java submissions
 * Your memory usage beats 8.82 % of java submissions (64.1 MB)
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
    public int pairSum(ListNode head) {
        LinkedList<Integer> s = new LinkedList<>();
        ListNode ori = head;
        int n = 0;
        while(head != null) {
            s.push(head.val);
            head = head.next;
            n++;
        }
        n /= 2;
        int max = 0;
        for(int i = 0; i <=n; i++) {
            max = Math.max(max, s.pop() + ori.val);
            ori = ori.next;
        }
        return max;
    }
}
// @lc code=end

