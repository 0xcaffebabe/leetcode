/*
 * @lc app=leetcode.cn id=面试题 04.03 lang=java
 * @lcpr version=21910
 *
 * [面试题 04.03] 特定深度节点链表
 * 
 * 49/49 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 85.6 % of java submissions (39.6 MB)
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class Solution {
    List<ListNode> list = new ArrayList<>();
    public ListNode[] listOfDepth(TreeNode tree) {
        dfs(tree, 1);
        return list.toArray(new ListNode[]{});
    }

    void dfs(TreeNode root, int level) {
        if (root == null) return;
        if (level > list.size()) list.add(new ListNode(root.val));
        else {
            var head = list.get(level - 1);
            while(head.next != null) head = head.next;
            head.next = new ListNode(root.val);
        }
        dfs(root.left, level + 1);
        dfs(root.right, level + 1);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,4,5,null,7,8]\n
// [1,2,3,4,5,null,7,8,9,10,11,12]\n
// [1]\n
// []\n
// @lcpr case=end

 */

