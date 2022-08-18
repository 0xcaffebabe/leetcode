import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=61 lang=java
 *
 * [61] 旋转链表
 * 
 * 231/231 cases passed (1 ms)
 * Your runtime beats 10.04 % of java submissions
 * Your memory usage beats 74.8 % of java submissions (40.8 MB)
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
    List<ListNode> list = new ArrayList<>();
    public ListNode rotateRight(ListNode head, int k) {
        // 参考 189. 轮转数组
        if (head == null) return null;
        while(head != null) {
            list.add(head);
            head = head.next;
        }
        k %= list.size();
        reverse(0, list.size() - 1);
        reverse(0, k - 1);
        reverse(k, list.size() - 1);
        return list.get(0);
    }
    void reverse(int start, int end) {
        while(start < end) {
            int c = list.get(start).val;
            list.get(start).val = list.get(end).val;
            list.get(end).val = c;
            start++;
            end--;
        }
    }
}
// @lc code=end

