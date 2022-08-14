import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=109 lang=java
 *
 * [109] 有序链表转换二叉搜索树
 * 
 * 32/32 cases passed (1 ms)
 * Your runtime beats 21.67 % of java submissions
 * Your memory usage beats 23.96 % of java submissions (42.8 MB)
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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> tmp = new ArrayList<>();
    public TreeNode sortedListToBST(ListNode head) {
        while(head != null) {
            tmp.add(head.val);
            head = head.next;
        }
        return dfs(0, tmp.size() - 1);
    }
    TreeNode dfs(int start, int end) {
        if (start > end) return null;
        if (start < 0 || end >= tmp.size()) return null;
        int mid = (start + end) / 2;
        // System.out.println(start + "|" + mid +"|" + end);
        return new TreeNode(tmp.get(mid), dfs(start, mid - 1), dfs(mid + 1, end));
    }
}
// @lc code=end

