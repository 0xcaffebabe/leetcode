/*
 * @lc app=leetcode.cn id=94 lang=java
 *
 * [94] 二叉树的中序遍历
 * 
 * 70/70 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 32.28 % of java submissions (39.8 MB)
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        walk(root, list);
        return list;
    }
    private void walk(TreeNode root, List<Integer> list){
        if (root == null) return;
        walk(root.left, list);
        list.add(root.val);
        walk(root.right, list);
    }
}
// @lc code=end

