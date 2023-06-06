/*
 * @lc app=leetcode.cn id=剑指 Offer II 050 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 050] 向下的路径节点之和
 * 
 * 127/127 cases passed (29 ms)
 * Your runtime beats 13.82 % of java submissions
 * Your memory usage beats 24.34 % of java submissions (41.8 MB)
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
    // 对每个节点进行递归检测是否存在
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;
        int ret = rootSum(root, targetSum);
        ret += pathSum(root.left, targetSum);
        ret += pathSum(root.right, targetSum);
        return ret;
    }
    // 从root往下的路径是否满足加起来=target
    int rootSum(TreeNode root, long target) {
        if (root == null) return 0;
        int ret = 0;
        if (root.val == target) ret++;

        ret += rootSum(root.left, target - root.val);
        ret += rootSum(root.right, target - root.val);
        return ret;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [10,5,-3,3,2,null,11,3,-2,null,1]\n8\n
// @lcpr case=end

// @lcpr case=start
// [5,4,8,11,null,13,4,7,2,null,null,5,1]\n22\n
// @lcpr case=end

 */

