/*
 * @lc app=leetcode.cn id=513 lang=java
 *
 * [513] 找树左下角的值
 * 
 * 76/76 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 19.38 % of java submissions (41.3 MB)
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
    private List<Integer> tmp = new ArrayList<>(16);
    public int findBottomLeftValue(TreeNode root) {
        travel(root, 0);
        return tmp.get(tmp.size() - 1);
    }
    private void travel(TreeNode root, int level) {
        if (root == null) return;
        if (level == tmp.size()) tmp.add(root.val);
        travel(root.left, level + 1);
        travel(root.right, level + 1);
    }

}
// @lc code=end

