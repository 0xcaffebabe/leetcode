import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=147 lang=java
 *
 * [147] 对链表进行插入排序
 * 
 * 19/19 cases passed (98 ms)
 * Your runtime beats 5.07 % of java submissions
 * Your memory usage beats 93.66 % of java submissions (40.7 MB)
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
    public ListNode insertionSortList(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        while(head != null) {
            list.add(head);
            head = head.next;
        }
        for(int i = 0; i < list.size(); i++) {
            int min = -1;
            for(int j = i; j < list.size(); j++) {
                if (min == -1 || list.get(j).val < list.get(min).val) min = j;
            }
            var c = list.get(i);
            list.set(i,list.get(min));
            list.set(min, c);
        }
        ListNode dumy = new ListNode();
        var ori = dumy;
        for(int i = 0; i < list.size(); i++) {
            dumy.next = list.get(i);
            dumy = dumy.next;
        }
        dumy.next = null;
        return ori.next;
    }
}
// @lc code=end

