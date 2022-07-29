/*
 * @lc app=leetcode.cn id=654 lang=java
 *
 * [654] 最大二叉树
 * 
 * 107/107 cases passed (2 ms)
 * Your runtime beats 75.01 % of java submissions
 * Your memory usage beats 66.53 % of java submissions (41.4 MB)
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
    private int[] nums;
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        this.nums = nums;
        return travel(0, nums.length - 1);
    }

    private TreeNode travel(int start, int end) {
        if (start > end) return null;
        int max = start;
        for(int i = start; i <= end; i++) if (nums[i] > nums[max]) max = i;
        var tree = new TreeNode(nums[max]);
        tree.left = travel(start, max - 1);
        tree.right = travel(max + 1, end);
        return tree;
    }
}
// @lc code=end

