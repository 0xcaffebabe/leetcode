/*
 * @lc app=leetcode.cn id=108 lang=java
 *
 * [108] 将有序数组转换为二叉搜索树
 * 
 * 31/31 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 44.22 % of java submissions (41.4 MB)
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
    public TreeNode sortedArrayToBST(int[] nums) {
        this.nums = nums;
        return travel(0, nums.length - 1);
    }

    private TreeNode travel(int start, int end) {
        if (start > end) return null;
        int mid = (start + end) / 2;
        var tree = new TreeNode(nums[mid]);
        tree.left = travel(start, mid - 1);
        tree.right = travel(mid + 1, end);
        return tree;
    }
}
// @lc code=end

