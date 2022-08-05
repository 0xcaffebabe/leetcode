/*
 * @lc app=leetcode.cn id=1315 lang=java
 *
 * [1315] 祖父节点值为偶数的节点和
 * 
 * 76/76 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 49.63 % of java submissions (43.5 MB)
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
    int ans = 0;
    public int sumEvenGrandparent(TreeNode root) {
        travel(root.left, root.val, -1);
        travel(root.right, root.val, -1);
        return ans;
    }
    void travel(TreeNode root, int p, int gp){
        if (root == null) return;
        if (gp % 2 == 0) ans += root.val;
        travel(root.left, root.val, p);
        travel(root.right, root.val, p);
    }
}
// @lc code=end

