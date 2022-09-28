/*
 * @lc app=leetcode.cn id=141 lang=java
 *
 * [141] 环形链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Map<ListNode,Boolean> map = new HashMap();
        while(head != null){
            if (map.containsKey(head)){
                return true;
            }
            map.put(head,true);
            head = head.next;
        }
        return false;
    }
}
// @lc code=end

