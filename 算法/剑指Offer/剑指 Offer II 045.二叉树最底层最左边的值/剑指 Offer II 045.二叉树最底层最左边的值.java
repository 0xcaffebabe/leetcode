/*
 * @lc app=leetcode.cn id=剑指 Offer II 045 lang=java
 * @lcpr version=21907
 *
 * [剑指 Offer II 045] 二叉树最底层最左边的值
 * 
 * 76/76 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 5.57 % of java submissions (42.6 MB)
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



/*
// @lcpr case=start
// [2,1,3]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,4,null,5,6,null,null,7]\n
// @lcpr case=end

 */

