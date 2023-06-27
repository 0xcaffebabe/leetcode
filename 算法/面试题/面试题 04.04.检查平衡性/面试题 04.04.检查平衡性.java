/*
 * @lc app=leetcode.cn id=面试题 04.04 lang=java
 * @lcpr version=21909
 *
 * [面试题 04.04] 检查平衡性
 * 
 * 227/227 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 22.22 % of java submissions (42 MB)
 */

// @lc code=start
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    boolean ans = true;
    public boolean isBalanced(TreeNode root) {
        height(root);
        return ans;
    }

    int height(TreeNode root) {
        if (root == null) return 0;
        var left = height(root.left);
        var right = height(root.right);
        if (Math.abs(left - right) > 1) ans = false;
        return Math.max(left, right) + 1;
    }
}
// @lc code=end

// @lcpr case=start
// [3,9,20,null,null,15,7]\n
// [1,2,2,3,3,null,null,4,4]\n
// [1]\n
// []\n
// @lcpr case=end
