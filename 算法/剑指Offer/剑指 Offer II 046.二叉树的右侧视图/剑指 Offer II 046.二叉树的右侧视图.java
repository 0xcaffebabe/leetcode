/*
 * @lc app=leetcode.cn id=剑指 Offer II 046 lang=java
 * @lcpr version=21910
 *
 * [剑指 Offer II 046] 二叉树的右侧视图
 * 
 * 215/215 cases passed (1 ms)
 * Your runtime beats 77.78 % of java submissions
 * Your memory usage beats 68.38 % of java submissions (40.1 MB)
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
    List<Integer> ans = new ArrayList<>(16);
    public List<Integer> rightSideView(TreeNode root) {
        travel(root, 0);
        return ans;
    }

    void travel(TreeNode root, int level) {
        if (root == null) return;
        if (ans.size() - 1 < level) ans.add(root.val);
        ans.set(level, root.val);
        travel(root.left, level + 1);
        travel(root.right, level + 1);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,null,5,null,4]\n
// @lcpr case=end

// @lcpr case=start
// [1,null,3]\n
// @lcpr case=end

// @lcpr case=start
// []\n
// @lcpr case=end

 */

