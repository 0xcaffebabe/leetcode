/*
 * @lc app=leetcode.cn id=剑指 Offer 28 lang=java
 * @lcpr version=21907
 *
 * [剑指 Offer 28] 对称的二叉树
 * 
 * 195/195 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 9.65 % of java submissions (39.9 MB)
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
    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    boolean check(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;

        return left.val == right.val
            && check(left.right, right.left)
            && check(right.right, left.left);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,2,3,4,4,3]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,2,null,3,null,3]\n
// @lcpr case=end

 */

