import java.util.LinkedList;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1019 lang=java
 *
 * [1019] 链表中的下一个更大节点
 * 
 * 76/76 cases passed (15 ms)
 * Your runtime beats 75.51 % of java submissions
 * Your memory usage beats 58.5 % of java submissions (44.7 MB)
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
    public int[] nextLargerNodes(ListNode head) {
        ListNode ori = head;
        Map<ListNode, ListNode> map = new HashMap<>();
        LinkedList<ListNode> s = new LinkedList<>();
        int cnt = 0;
        while(head != null) {
            while (!s.isEmpty() && s.peek().val < head.val) {
                map.put(s.pop(), head);
            }
            s.push(head);
            head = head.next;
            cnt++;
        }
        head = ori;
        int[] ans = new int[cnt];
        int pos = 0;
        while(head != null) {
            var node = map.get(head);
            if (node == null) ans[pos++]=0;
            else ans[pos++]=node.val;
            head = head.next;
        }
        return ans;
    }
}
// @lc code=end

