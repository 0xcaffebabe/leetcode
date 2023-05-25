/*
 * @lc app=leetcode.cn id=剑指 Offer II 021 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 021] 删除链表的倒数第 n 个结点
 * 
 * 208/208 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 11.81 % of java submissions (39.8 MB)
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



/*
// @lcpr case=start
// [1,2,3,4,5]\n2\n
// @lcpr case=end

// @lcpr case=start
// [1]\n1\n
// @lcpr case=end

// @lcpr case=start
// [1,2]\n1\n
// @lcpr case=end

 */

