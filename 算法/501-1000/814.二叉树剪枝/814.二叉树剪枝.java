/*
 * @lc app=leetcode.cn id=814 lang=java
 * @lcpr version=21907
 *
 * [814] 二叉树剪枝
 * 
 * 31/31 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 75.93 % of java submissions (39 MB)
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
// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode() {}
//     TreeNode(int val) { this.val = val; }
//     TreeNode(int val, TreeNode left, TreeNode right) {
//         this.val = val;
//         this.left = left;
//         this.right = right;
//     }
// }
class Solution {
    public TreeNode pruneTree(TreeNode root) {
        if (travel(root)) return null;
        return root;
    }

    private boolean travel(TreeNode root) {
        boolean ret = root.val == 0;
        if (root.left != null) {
            var t = travel(root.left);
            if (t) root.left = null;
            ret &= t;
        }
        if (root.right != null) {
            var t = travel(root.right);
            if (t) root.right = null;
            ret &= t;
        }
        return ret;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,null,0,0,1]\n
// @lcpr case=end

// @lcpr case=start
// [1,0,1,0,0,0,1]\n
// @lcpr case=end

// @lcpr case=start
// [1,1,0,1,1,0,1,0]\n
// @lcpr case=end

// @lcpr case=start
// [0]\n
// @lcpr case=end

// @lcpr case=start
// [1]\n
// @lcpr case=end

 */

