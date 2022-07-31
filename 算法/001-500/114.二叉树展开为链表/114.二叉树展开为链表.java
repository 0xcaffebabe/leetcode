/*
 * @lc app=leetcode.cn id=114 lang=java
 *
 * [114] 二叉树展开为链表
 * 
 * 225/225 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 90.84 % of java submissions (40.7 MB)
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
    private List<TreeNode> tmp = new ArrayList<>(16);
    public void flatten(TreeNode root) {
        if (root == null) return;
        travel(root);
        for(int i = 1; i < tmp.size(); i++) {
            tmp.get(i - 1).right = tmp.get(i);
            tmp.get(i - 1).left = null;
        }
    }

    private void travel(TreeNode root) {
        if (root == null) return;
        tmp.add(root);
        travel(root.left);
        travel(root.right);
    }
}
// @lc code=end

