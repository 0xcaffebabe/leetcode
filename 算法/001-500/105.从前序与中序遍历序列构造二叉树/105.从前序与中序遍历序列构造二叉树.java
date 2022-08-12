/*
 * @lc app=leetcode.cn id=105 lang=java
 *
 * [105] 从前序与中序遍历序列构造二叉树
 * 
 * 203/203 cases passed (3 ms)
 * Your runtime beats 48.41 % of java submissions
 * Your memory usage beats 85.39 % of java submissions (40.9 MB)
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
    int[] preorder;
    int[] inorder;
    int pos = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        this.inorder = inorder;
        return travel(0, inorder.length - 1);
    }
    TreeNode travel(int start, int end) {
        if (start > end) return null;
        if (start < 0 || end >= inorder.length) return null;
        int rootVal = preorder[pos++];
        // System.out.println(rootVal);
        int rootIndex = -1;
        for(int i = start; i <= end; i++) {
            if (inorder[i] == rootVal) {
                rootIndex = i;
                break;
            }
        }

        return new TreeNode(rootVal, travel(start, rootIndex - 1), travel(rootIndex + 1, end));
    }
}
// @lc code=end

