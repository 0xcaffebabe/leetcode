/*
 * @lc app=leetcode.cn id=437 lang=java
 *
 * [437] 路径总和 III
 * 
 * 128/128 cases passed (33 ms)
 * Your runtime beats 13.3 % of java submissions
 * Your memory usage beats 62.05 % of java submissions (41 MB)
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
    // 对每个节点进行递归检测是否存在
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;
        int ret = rootSum(root, targetSum);
        ret += pathSum(root.left, targetSum);
        ret += pathSum(root.right, targetSum);
        return ret;
    }
    // 从root往下的路径是否满足加起来=target
    int rootSum(TreeNode root, long target) {
        if (root == null) return 0;
        int ret = 0;
        if (root.val == target) ret++;

        ret += rootSum(root.left, target - root.val);
        ret += rootSum(root.right, target - root.val);
        return ret;
    }
}
// @lc code=end

