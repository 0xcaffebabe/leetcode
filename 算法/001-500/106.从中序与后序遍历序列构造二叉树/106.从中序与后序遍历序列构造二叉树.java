/*
 * @lc app=leetcode.cn id=106 lang=java
 *
 * [106] 从中序与后序遍历序列构造二叉树
 * 
 * 202/202 cases passed (2 ms)
 * Your runtime beats 58.86 % of java submissions
 * Your memory usage beats 93.92 % of java submissions (40.8 MB)
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
    int[] inorder;
    int[] postorder;
    Map<Integer, Integer> posMap = new HashMap<>(32);
    int pos;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.inorder = inorder;
        this.postorder = postorder;
        this.pos = postorder.length - 1;
        for(int i = 0; i < inorder.length; i++) posMap.put(inorder[i], i);
        return travel(0, postorder.length - 1);
    }
    TreeNode travel(int start, int end) {
        if (start > end) return null;
        if (start < 0 || end >= inorder.length) return null;
        int rootVal = postorder[pos--];
        int rootIndex = posMap.get(rootVal);
        var right = travel(rootIndex + 1, end);
        var left = travel(start, rootIndex - 1);
        return new TreeNode(rootVal, left, right);
    }
}
// @lc code=end

