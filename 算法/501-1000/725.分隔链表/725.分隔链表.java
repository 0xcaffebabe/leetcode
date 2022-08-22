/*
 * @lc app=leetcode.cn id=725 lang=java
 *
 * [725] 分隔链表
 * 
 * 43/43 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 19.55 % of java submissions (41.7 MB)
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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int len = len(head);
        if (len == 0) return new ListNode[k];

        ListNode[] ans = new ListNode[k];
        int remainder = len % k;
        for(int i = 0; i < k; i++) {
            int cnt = 0;
            if (i < remainder) cnt = len / k + 1; 
            else cnt = len / k;

            ListNode root = new ListNode();
            var ori = root;
            while(cnt > 0) {
                root.next = new ListNode(head.val);
                root = root.next;
                head = head.next;
                cnt--;
            }
            ans[i] = ori.next;
        }
        return ans;
    }

    int len(ListNode head) {
        int len = 0;
        while (head != null) {
            head = head.next;
            len++;
        }
        return len;
    }
}
// @lc code=end

