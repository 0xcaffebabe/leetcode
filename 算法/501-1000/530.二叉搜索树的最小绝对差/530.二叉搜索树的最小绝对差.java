import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=530 lang=java
 *
 * [530] 二叉搜索树的最小绝对差
 * 
 * 188/188 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 39.83 % of java submissions (41.2 MB)
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
    int min = Integer.MAX_VALUE; 
    int prev = -1;
    public int getMinimumDifference(TreeNode root) {
        travel(root);
        return min;
    }
    void travel(TreeNode root) {
        if (root == null) return;
        travel(root.left);
        if (prev == -1) prev = root.val;
        else {
            min = Math.min(min, root.val - prev);
            prev = root.val;
        }
        travel(root.right);
    }
}
// @lc code=end

