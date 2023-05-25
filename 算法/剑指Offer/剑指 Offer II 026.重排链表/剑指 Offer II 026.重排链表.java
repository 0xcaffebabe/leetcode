/*
 * @lc app=leetcode.cn id=剑指 Offer II 026 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 026] 重排链表
 * 
 * 12/12 cases passed (3 ms)
 * Your runtime beats 39.26 % of java submissions
 * Your memory usage beats 31.48 % of java submissions (44.3 MB)
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
    public void reorderList(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        while(head != null) {
            list.add(head);
            head = head.next;
        }
        int n = list.size();
        if (n < 2) return;
        int i = 0;
        int j = n - 1;
        while(i < j) {
            list.get(i).next = list.get(j);
            i++;
            if (i == j) break;
            list.get(j).next = list.get(i);
            j--;
        }
        list.get(i).next = null;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,4]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,4,5]\n
// @lcpr case=end

 */

