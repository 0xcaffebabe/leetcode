/*
 * @lc app=leetcode.cn id=2487 lang=java
 * @lcpr version=
 *
 * [2487] 从链表中移除节点
 * 
 * 32/32 cases passed (11 ms)
 * Your runtime beats 86.2 % of java submissions
 * Your memory usage beats 64.93 % of java submissions (65.2 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }
class Solution {
    public ListNode removeNodes(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        while(head != null) {
            list.add(head);
            head = head.next;
        }
        int max = Integer.MIN_VALUE;
        List<ListNode> ans = new ArrayList<>();
        for(int i = list.size() - 1; i >= 0; i--) {
            var val = list.get(i).val;
            max = Math.max(max, val);
            if (val == max) ans.add(list.get(i));
        }
        // System.out.println(ans);
        // Collections.reverse(ans);
        ans.get(ans.size() - 1).next = null;
        for(int i = ans.size() - 1; i > 0; i--) 
            ans.get(i).next = ans.get(i - 1);
        return ans.get(ans.size() - 1);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [5,2,13,3,8]\n
// @lcpr case=end

// @lcpr case=start
// [1,1,1,1]\n
// [1]\n
// [1,2]\n
// [2,1]\n
// [2,2]\n
// [1,2,3]\n
// [3,2,1]\n
// @lcpr case=end

 */

