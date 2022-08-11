/*
 * @lc app=leetcode.cn id=82 lang=java
 *
 * [82] 删除排序链表中的重复元素 II
 * 
 * 166/166 cases passed (3 ms)
 * Your runtime beats 7.18 % of java submissions
 * Your memory usage beats 23.04 % of java submissions (41.2 MB)
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
    public ListNode deleteDuplicates(ListNode head) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        while(head != null) {
            map.putIfAbsent(head.val, 0);
            map.put(head.val, map.get(head.val) + 1);
            head = head.next;
        }
        ListNode node = new ListNode();
        ListNode ans = node;
        for(var enr: map.entrySet()) {
            if (enr.getValue() > 1) continue;
            node.next = new ListNode(enr.getKey());
            node = node.next;
        }
        return ans.next;
    }
}
// @lc code=end

