/*
 * @lc app=leetcode.cn id=199 lang=java
 *
 * [199] 二叉树的右视图
 * 
 * 216/216 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 80.39 % of java submissions (39.9 MB)
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
    List<Integer> ans = new ArrayList<>(16);
    public List<Integer> rightSideView(TreeNode root) {
        travel(root, 0);
        return ans;
    }

    void travel(TreeNode root, int level) {
        if (root == null) return;
        if (ans.size() - 1 < level) ans.add(root.val);
        ans.set(level, root.val);
        travel(root.left, level + 1);
        travel(root.right, level + 1);
    }
}
// @lc code=end

