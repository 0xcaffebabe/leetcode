/*
 * @lc app=leetcode.cn id=515 lang=java
 *
 * [515] 在每个树行中找最大值
 * 
 * 78/78 cases passed (1 ms)
 * Your runtime beats 93.17 % of java submissions
 * Your memory usage beats 89.81 % of java submissions (41.4 MB)
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
    public List<Integer> largestValues(TreeNode root) {
        travel(root, 0);
        return ans;
    }
    void travel(TreeNode root, int level) {
        if (root == null) return;
        if (ans.size() - 1 < level) ans.add(Integer.MIN_VALUE);
        if (root.val > ans.get(level)) ans.set(level, root.val);
        travel(root.left, level + 1);
        travel(root.right, level + 1);
    }
}
// @lc code=end

