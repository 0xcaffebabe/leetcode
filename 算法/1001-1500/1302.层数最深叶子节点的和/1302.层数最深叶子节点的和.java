/*
 * @lc app=leetcode.cn id=1302 lang=java
 *
 * [1302] 层数最深叶子节点的和
 * 
 * 39/39 cases passed (2 ms)
 * Your runtime beats 69.28 % of java submissions
 * Your memory usage beats 5.1 % of java submissions (44.5 MB)
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
    private int maxDepth = 0;
    private int sum;
    public int deepestLeavesSum(TreeNode root) {
        travel(root, 0);
        calc(root, 0);
        return sum;
    }

    private void calc(TreeNode root, int depth){
        if (root == null) return;
        int curDepth = depth + 1;
        calc(root.left, curDepth);
        calc(root.right, curDepth);
        if (depth == maxDepth - 1) sum += root.val;
    }

    private void travel(TreeNode root, int depth){
        if (depth > maxDepth) maxDepth = depth;
        if (root == null) return;
        int curDepth = depth + 1;
        travel(root.left, curDepth);
        travel(root.right, curDepth);
    }
}
// @lc code=end

