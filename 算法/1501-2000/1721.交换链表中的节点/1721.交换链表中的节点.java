/*
 * @lc app=leetcode.cn id=1721 lang=java
 * @lcpr version=21907
 *
 * [1721] 交换链表中的节点
 * 
 * 132/132 cases passed (2 ms)
 * Your runtime beats 94.46 % of java submissions
 * Your memory usage beats 55.67 % of java submissions (55.9 MB)
 */

// @lc code=start
// class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode ori = head;
        int cnt = 1;
        ListNode a = null;
        while(head != null) {
            if (cnt == k) a = head;
            head = head.next;
            cnt++;
        }
        int n = cnt;
        cnt = 1;
        head = ori;
        while(head != null) {
            if (cnt == n - k && a != null) {
                int t = head.val;
                head.val = a.val;
                a.val = t;
                break;
            }
            head = head.next;
            cnt++;
        }
        return ori;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,4,5]\n2\n
// @lcpr case=end

// @lcpr case=start
// [7,9,6,6,7,8,3,0,9,5]\n5\n
// @lcpr case=end

// @lcpr case=start
// [1]\n1\n
// @lcpr case=end

// @lcpr case=start
// [1,2]\n1\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3]\n2\n
// @lcpr case=end

 */

