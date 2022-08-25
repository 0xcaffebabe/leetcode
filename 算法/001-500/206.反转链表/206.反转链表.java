/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
 * 
 * 28/28 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 8.05 % of java submissions (41.6 MB)
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
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        LinkedList<Integer> stack = new LinkedList<>();
        while(head != null){
            stack.push(head.val);
            head = head.next;
        }
        ListNode root = new ListNode();
        ListNode origin = root;
        while(!stack.isEmpty()){
            root.val = stack.pop();
            if (!stack.isEmpty()){
                root.next = new ListNode();
                root = root.next;
            }
        }
        return origin;
    }
}
// @lc code=end

