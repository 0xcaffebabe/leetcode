/*
 * @lc app=leetcode.cn id=1669 lang=java
 * @lcpr version=
 *
 * [1669] 合并两个链表
 * 
 * 61/61 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 68.01 % of java submissions (44.9 MB)
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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        var ori1 = list1;
        var an = new ListNode();
        var bn = new ListNode();
        int p = 0;
        while(list1 != null) {
            if (p == b) bn = list1.next;
            p++;
            if (p == a) an = list1;
            list1 = list1.next;
        }
        an.next = list2;
        while(list2.next != null) list2 = list2.next;
        list2.next = bn;
        return ori1;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [0,1,2,3,4,5]\n3\n4\n[1000000,1000001,1000002]\n
// @lcpr case=end

// @lcpr case=start
// [0,1,2,3,4,5,6]\n2\n5\n[1000000,1000001,1000002,1000003,1000004]\n
// @lcpr case=end

// @lcpr case=start
// [0,3,2,1,4,5]\n3\n4\n[1000000,1000001,1000002]\n
// @lcpr case=end

 */

