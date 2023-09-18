/*
 * @lc app=leetcode.cn id=LCP 67 lang=java
 * @lcpr version=
 *
 * [LCP 67] 装饰树
 * 
 * 61/61 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 53.66 % of java submissions (54.8 MB)
 */

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
    public TreeNode expandBinaryTree(TreeNode root) {
        if (root == null) return null;
        var l = root.left;
        var r = root.right;
        if (l != null) {
            root.left = new TreeNode(-1);
            root.left.left = l;
        }
        if (r != null) {
            root.right = new TreeNode(-1);
            root.right.right = r;
        }
        expandBinaryTree(l);
        expandBinaryTree(r);
        return root;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [7,5,6]\n
// [3,1,7,3,8,null,4]\n
// [3]\n
// []\n
// @lcpr case=end

// @lcpr case=start
// @lcpr case=end

 */

