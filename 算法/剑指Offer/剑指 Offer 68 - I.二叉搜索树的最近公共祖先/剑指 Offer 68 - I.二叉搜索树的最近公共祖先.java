/*
 * @lc app=leetcode.cn id=剑指 Offer 68 - I lang=java
 * @lcpr version=21907
 *
 * [剑指 Offer 68 - I] 二叉搜索树的最近公共祖先
 * 
 * 27/27 cases passed (5 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 98.23 % of java submissions (41.7 MB)
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (root.val > p.val && root.val > q.val) return lowestCommonAncestor(root.left, p, q);
        else if(root.val < p.val && root.val < q.val) return lowestCommonAncestor(root.right, p, q);
        
        return root;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [6,2,8,0,4,7,9,null,null,3,5]\n2\n8\n
// @lcpr case=end

// @lcpr case=start
// [6,2,8,0,4,7,9,null,null,3,5]\n2\n4\n
// @lcpr case=end

 */

