/*
 * @lc app=leetcode.cn id=剑指 Offer II 023 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 023] 两个链表的第一个重合节点
 * 
 * 39/39 cases passed (8 ms)
 * Your runtime beats 7.22 % of java submissions
 * Your memory usage beats 6.61 % of java submissions (45.4 MB)
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Map<ListNode,Boolean> map = new HashMap<>();
        while(headA != null){
            map.put(headA, true);
            headA = headA.next;
        }
        while(headB != null){
            if (map.containsKey(headB)) return headB;
            headB = headB.next;
        }
        return null;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 8\n[4,1,8,4,5]\n[5,0,1,8,4,5]\n2\n3\n
// @lcpr case=end

// @lcpr case=start
// 2\n[0,9,1,2,4]\n[3,2,4]\n3\n1\n
// @lcpr case=end

// @lcpr case=start
// 0\n[2,6,4]\n[1,5]\n3\n2\n
// @lcpr case=end

 */

