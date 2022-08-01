/*
 * @lc app=leetcode.cn id=2265 lang=java
 *
 * [2265] 统计值等于子树平均值的节点数
 * 
 * 138/138 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 24.63 % of java submissions (41.2 MB)
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
    private int ans;
    public int averageOfSubtree(TreeNode root) {
        travel(root);
        return ans;
    }

    private int[] travel(TreeNode root) {
        if (root == null) return new int[]{0, 0};
        if (root.left == null && root.right == null) {
            ans++;
            return new int[]{root.val, 1};
        }
        int[] l = travel(root.left);
        int[] r = travel(root.right);
        if (root.val == (l[0]+r[0]+root.val) / (l[1]+r[1]+1)) ans++;
        return new int[]{root.val+l[0]+r[0], l[1]+r[1] + 1};
    }
}
// @lc code=end

