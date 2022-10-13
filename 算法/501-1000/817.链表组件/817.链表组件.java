import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=817 lang=java
 *
 * [817] 链表组件
 * 
 * 57/57 cases passed (6 ms)
 * Your runtime beats 58.04 % of java submissions
 * Your memory usage beats 62.65 % of java submissions (42 MB)
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
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(var i : nums) set.add(i);
        int ans = 0;
        while(head != null) {
            // 找到最长一段的链表 这段链表的所有值都在nums中
            if (set.contains(head.val)) {
                while(head != null && set.contains(head.val)) head = head.next;
                ans++;
            } else {
                head = head.next;
            }
        }
        return ans;
    }
}
// @lc code=end

