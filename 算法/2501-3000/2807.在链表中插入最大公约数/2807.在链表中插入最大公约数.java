/*
 * @lc app=leetcode.cn id=2807 lang=java
 * @lcpr version=
 *
 * [2807] 在链表中插入最大公约数
 * 
 * 582/582 cases passed (2 ms)
 * Your runtime beats 86.02 % of java submissions
 * Your memory usage beats 32.48 % of java submissions (42.7 MB)
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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        var ori = head;
        while(head != null) {
            if (head.next != null) {
                var t = head.next;
                int g = 0;
                head.next = new ListNode(gcd(head.val, t.val), t);
                head = t;
            } else {
                head = head.next;
            }
        }
        return ori;
    }

    int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [18,6,10,3]\n
// @lcpr case=end

// @lcpr case=start
// [7]\n
// [1,7]\n
// [1,1]\n
// @lcpr case=end

 */

