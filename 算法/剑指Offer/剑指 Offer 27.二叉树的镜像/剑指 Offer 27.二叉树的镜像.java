 /*
 * @lc app=leetcode.cn id=剑指 Offer 27 lang=java
 * @lcpr version=21907
 *
 * [剑指 Offer 27] 二叉树的镜像
 * 
 * 
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
    public TreeNode mirrorTree(TreeNode root) {
        invertTree0(root);
        return root;
    }
    private void invertTree0(TreeNode root){
        if (root == null) return;
        
        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;

        if (root.left !=null) invertTree0(root.left);
        if (root.right !=null) invertTree0(root.right);
    }
}
// @lc code=end



/*

// @lcpr case=start
// [4,2,7,1,3,6,9]\n
// @lcpr case=end

 */

