/*
 * @lc app=leetcode.cn id=102 lang=java
 *
 * [102] 二叉树的层序遍历
 * 
 * 34/34 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 10.9 % of java submissions (41.8 MB)
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
    private List<List<Integer>> ans = new ArrayList<>(16);
    public List<List<Integer>> levelOrder(TreeNode root) {
        travel(root, 0);
        return ans;
    }

    private void travel(TreeNode root, int level) {
        if (root == null) return;
        if (ans.size() <= level) ans.add(new ArrayList<>());
        ans.get(level).add(root.val);
        travel(root.left, level + 1);
        travel(root.right, level + 1);
    }
}
// @lc code=end

