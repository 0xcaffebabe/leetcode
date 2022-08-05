/*
 * @lc app=leetcode.cn id=113 lang=java
 *
 * [113] 路径总和 II
 * 
 * 115/115 cases passed (6 ms)
 * Your runtime beats 6.16 % of java submissions
 * Your memory usage beats 5 % of java submissions (44 MB)
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
    List<List<Integer>> ans = new ArrayList<>();
    int target;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        this.target = targetSum;
        travel(root, 0, new ArrayList<>());
        return ans;
    }
    void travel(TreeNode root, int last, List<Integer> path) {
        if (root == null) return;

        var list = new ArrayList<Integer>();
        for(var p : path) list.add(p);
        list.add(root.val);

        if (root.left == null && root.right == null) {
            if (last + root.val == target) ans.add(list);
            return;
        }
        travel(root.left, last + root.val, list);
        travel(root.right, last + root.val, list);
    }
}
// @lc code=end

