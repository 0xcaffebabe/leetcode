import java.util.ArrayList;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=99 lang=java
 *
 * [99] 恢复二叉搜索树
 * 
 * 1919/1919 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 50.04 % of java submissions (41.5 MB)
 */

// @lc code=start
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
    ArrayList<TreeNode> tmp = new ArrayList<>();
    public void recoverTree(TreeNode root) {
        travel(root);
        TreeNode first = null;
        TreeNode last = null;
        for(int i = 0; i < tmp.size() - 1; i++) {
            if (tmp.get(i + 1).val < tmp.get(i).val) {
                last = tmp.get(i + 1);
                if (first == null) first = tmp.get(i);
                else break;
            }
        }
        int t = last.val;
        last.val = first.val;
        first.val = t;
    }
    void travel(TreeNode root) {
        if (root == null) return;
        travel(root.left);
        tmp.add(root);
        travel(root.right);
    }
}
// @lc code=end

