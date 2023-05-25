/*
 * @lc app=leetcode.cn id=剑指 Offer II 022 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 022] 链表中环的入口节点
 * 
 * 16/16 cases passed (3 ms)
 * Your runtime beats 20.92 % of java submissions
 * Your memory usage beats 26.35 % of java submissions (42.2 MB)
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
    public ListNode detectCycle(ListNode head) {
        Map<ListNode, Boolean> map = new HashMap<>();
        while(head != null) {
            if (map.containsKey(head)) return head;
            map.put(head, true);
            head = head.next;
        }
        return null;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,2,0,-4]\n1\n
// @lcpr case=end

// @lcpr case=start
// [1,2]\n0\n
// @lcpr case=end

// @lcpr case=start
// [1]\n-1\n
// @lcpr case=end

 */

