/*
 * @lc app=leetcode.cn id=剑指 Offer II 027 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 027] 回文链表
 * 
 * 85/85 cases passed (20 ms)
 * Your runtime beats 13.14 % of java submissions
 * Your memory usage beats 4.99 % of java submissions (64.5 MB)
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
    private ListNode origin;
    public boolean isPalindrome(ListNode head) {
        origin = head;
        return travel(head);
    }
    private boolean travel(ListNode head){
        if (head == null) return true;
        if (!travel(head.next)){
            return false;
        }
        if (head.val == origin.val){
            origin = origin.next;
            return true;
        }else {
            return false;
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,3,2,1]\n
// @lcpr case=end

// @lcpr case=start
// [1,2]\n
// @lcpr case=end

 */

