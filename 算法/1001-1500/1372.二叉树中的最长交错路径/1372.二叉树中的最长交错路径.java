/*
 * @lc app=leetcode.cn id=1372 lang=java
 * @lcpr version=
 *
 * [1372] 二叉树中的最长交错路径
 * 
 * 58/58 cases passed (6 ms)
 * Your runtime beats 85.51 % of java submissions
 * Your memory usage beats 44.53 % of java submissions (53.7 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
class Solution {
    public int longestZigZag(TreeNode root) {
        return Math.max(maxZigZag(root.left, 1, true), maxZigZag(root.right, 1, false)) - 1;
    }

    int maxZigZag(TreeNode root, int depth, boolean left) {
        if (root == null) return depth;
        if (left)
            return Math.max(maxZigZag(root.left, 1, true), maxZigZag(root.right, depth + 1, false));
        else
            return Math.max(maxZigZag(root.left, depth + 1, true), maxZigZag(root.right, 1, false));
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,null,1,1,1,null,null,1,1,null,1,null,null,null,1,null,1]\n
// @lcpr case=end

// @lcpr case=start
// [1,1,1,null,1,null,null,1,1,null,1]\n
// @lcpr case=end

// @lcpr case=start
// [1]\n
// [1,2]\n
// [1,2,3]\n
// [1,2,3,4]\n
// @lcpr case=end

 */

