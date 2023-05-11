/*
 * @lc app=leetcode.cn id=25 lang=java
 * @lcpr version=21907
 *
 * [25] K 个一组翻转链表
 * 
 * 62/62 cases passed (2 ms)
 * Your runtime beats 7.47 % of java submissions
 * Your memory usage beats 5.02 % of java submissions (42.1 MB)
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

// class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }
class Solution {
    List<ListNode> list = new ArrayList<>();
    public ListNode reverseKGroup(ListNode head, int k) {
        while(head != null) {
            list.add(head);
            head = head.next;
        }
        int n = list.size();
        for(int i = 1; i < n; i ++) {
            if (i * k - 1 >= n) break;
            reverse((i-1)*k, i * k - 1);
            // System.out.println((i-1)*k + "|" + (i*k-1));
        }
        head = new ListNode();
        var ori = head;
        for(var i : list) {
            head.next = i;
            head = head.next;
        }
        head.next = null;
        return ori.next;
    }

    private void reverse(int st, int en) {
        int n = (en - st) / 2;
        for(int i = 0; i <= n; i++) {
            var t = list.get(st + i);
            list.set(st+i, list.get(en - i));
            list.set(en - i, t);
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,4,5]\n2\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,4,5]\n3\n
// @lcpr case=end

// @lcpr case=start
// [1]\n1\n
// @lcpr case=end

// @lcpr case=start
// [1,2]\n1\n
// @lcpr case=end

// @lcpr case=start
// [1,2]\n2\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3]\n3\n
// @lcpr case=end

 */

