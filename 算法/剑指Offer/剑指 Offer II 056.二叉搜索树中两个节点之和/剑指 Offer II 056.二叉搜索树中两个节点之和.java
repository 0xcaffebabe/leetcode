/*
 * @lc app=leetcode.cn id=剑指 Offer II 056 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 056] 二叉搜索树中两个节点之和
 * 
 * 424/424 cases passed (4 ms)
 * Your runtime beats 26.3 % of java submissions
 * Your memory usage beats 5.1 % of java submissions (43.5 MB)
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
    private HashSet<Integer> set = new HashSet<>();
    private int k;
    public boolean findTarget(TreeNode root, int k) {
        this.k = k;
        preorder(root);
        if (set.size() == 1) return false;
        return check(root);
    }

    private void preorder(TreeNode root) {
        if (root == null) return;
        set.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }

    private boolean check(TreeNode root) {
        if (root == null) return false;
        int a = root.val;
        int b = k - root.val;
        if (set.contains(b) && a != b) return true;
        if (check(root.left) || check(root.right)) return true;
        return false;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [8,6,10,5,7,9,11]\n12\n
// @lcpr case=end

// @lcpr case=start
// [8,6,10,5,7,9,11]\n22\n
// @lcpr case=end

 */

