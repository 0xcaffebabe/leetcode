/*
 * @lc app=leetcode.cn id=1026 lang=java
 * @lcpr version=21907
 *
 * [1026] 节点与其祖先之间的最大差值
 * 
 * 28/28 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 99.83 % of java submissions (39.7 MB)
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
    int ans = 0;
    public int maxAncestorDiff(TreeNode root) {
        travel(root, root.val, root.val);
        return ans;
    }

    private void travel(TreeNode root, int max, int min) {
        if (root == null) return;
        max = Math.max(max, root.val);
        min = Math.min(min, root.val);
        ans  = Math.max(ans, Math.abs(max - min));
        travel(root.left, max, min);
        travel(root.right, max, min);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [8,3,10,1,6,null,14,null,null,4,7,13]\n
// @lcpr case=end

// @lcpr case=start
// [1,null,2,null,0,3]\n
// @lcpr case=end

 */

