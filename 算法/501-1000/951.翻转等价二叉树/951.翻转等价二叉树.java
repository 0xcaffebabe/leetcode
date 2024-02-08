/*
 * @lc app=leetcode.cn id=951 lang=java
 * @lcpr version=
 *
 * [951] 翻转等价二叉树
 * 
 * 77/77 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 88.84 % of java submissions (38.9 MB)
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
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        if (root1.val == root2.val) {
            return (flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left)) || 
                (flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right));
        }
        return false;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,4,5,6,null,null,null,7,8]\n[1,3,2,null,6,4,5,null,null,null,null,8,7]\n
// [0,2,1,4,null,3,5,null,null,6,7]\n[0,2,1,4,null,3,5,null,null,null,6,7]\n
// [0,null,1]\n[]
// @lcpr case=end

// @lcpr case=start
// []\n[]\n
// @lcpr case=end

// @lcpr case=start
// []\n[1]\n
// @lcpr case=end

 */

