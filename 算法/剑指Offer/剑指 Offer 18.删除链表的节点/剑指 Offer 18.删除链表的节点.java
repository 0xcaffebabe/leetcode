/*
 * @lc app=leetcode.cn id=剑指 Offer 18 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer 18] 删除链表的节点
 * 
 * 37/37 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 15.24 % of java submissions (41.7 MB)
 */

// @lc code=start
// class ListNode {
//     int val;
//     ListNode next;
//     ListNode(int x) { val = x; }
// }

class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        if (head.val == val) return head.next;
        var ori = head;
        var prev = head;
        while(head != null) {
            if (head.val == val) {
                prev.next = head.next;
                break;
            }
            prev = head;
            head = head.next;
        }
        return ori;
    }
}
// @lc code=end

/*
// @lcpr case=start
// [4,5,1,9]\n5\n
// @lcpr case=end

// @lcpr case=start
// [4,5,1,9]\n1\n
// @lcpr case=end

// @lcpr case=start
// [4,5,1,9]\n4\n
// @lcpr case=end

// @lcpr case=start
// [4,5,1,9]\n9\n
// @lcpr case=end

// @lcpr case=start
// [4]\n4\n
// @lcpr case=end

// @lcpr case=start
// [4,2]\n4\n
// @lcpr case=end

// @lcpr case=start
// [4,2]\n2\n
// @lcpr case=end

 */

