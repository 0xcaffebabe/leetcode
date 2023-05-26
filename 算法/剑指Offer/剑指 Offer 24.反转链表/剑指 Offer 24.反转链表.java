/*
 * @lc app=leetcode.cn id=剑指 Offer 24 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer 24] 反转链表
 * 
 * 27/27 cases passed (2 ms)
 * Your runtime beats 1.19 % of java submissions
 * Your memory usage beats 77.66 % of java submissions (40.7 MB)
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
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



/*


// @lcpr case=start
// 1->2->3->4->5->NULL\n
// @lcpr case=end

 */

