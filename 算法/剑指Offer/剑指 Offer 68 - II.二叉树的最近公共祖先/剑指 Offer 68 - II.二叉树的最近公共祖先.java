/*
 * @lc app=leetcode.cn id=剑指 Offer 68 - II lang=java
 * @lcpr version=21907
 *
 * [剑指 Offer 68 - II] 二叉树的最近公共祖先
 * 
 * 31/31 cases passed (7 ms)
 * Your runtime beats 38.52 % of java submissions
 * Your memory usage beats 77.55 % of java submissions (41.4 MB)
 */

// @lc code=start
// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode(int x) { val = x; }
// }
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        // 当前节点是p或q
        if (root == p || root == q) return root;
        var left = lowestCommonAncestor(root.left, p, q);
        var right = lowestCommonAncestor(root.right, p, q);

        // pq 同时存在于左右子树
        if (left != null && right != null) return root;
        // 存在于右子树
        if (left == null) return right;
        // 存在于左子树
        if (right == null) return left;
        return null;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,5,1,6,2,0,8,null,null,7,4]\n5\n1\n
// @lcpr case=end

// @lcpr case=start
// [3,5,1,6,2,0,8,null,null,7,4]\n5\n4\n
// @lcpr case=end

 */

