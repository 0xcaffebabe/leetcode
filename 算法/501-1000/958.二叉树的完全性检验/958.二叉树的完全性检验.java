import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=958 lang=java
 *
 * [958] 二叉树的完全性检验
 * 
 * 119/119 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 6.12 % of java submissions (41.3 MB)
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
    List<List<Integer>> tmp = new ArrayList<>();
    int p;
    int n;
    public boolean isCompleteTree(TreeNode root) {
        travel(root, 1);
        return n == p;
    }
    void travel(TreeNode root, int k) {
        if (root == null) return;
        n++;
        p = Math.max(p, k);
        travel(root.left, 2 * k);
        travel(root.right, 2 * k + 1);
    }
}
// @lc code=end

