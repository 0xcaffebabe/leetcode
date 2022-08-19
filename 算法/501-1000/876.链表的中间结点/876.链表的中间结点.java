/*
 * @lc app=leetcode.cn id=876 lang=java
 *
 * [876] 链表的中间结点
 * 
 * 36/36 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 5.08 % of java submissions (39.4 MB)
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
    public ListNode middleNode(ListNode head) {
        ListNode[] map = new ListNode[101];
        int i = 1;
        while(head != null){
            map[i]=head;
            i++;
            head = head.next;
        }
        if (i % 2 !=0) return map[i/2+1];
        else return map[i/2];
    }
}
// @lc code=end

