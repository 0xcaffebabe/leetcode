/*
 * @lc app=leetcode.cn id=剑指 Offer 34 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer 34] 二叉树中和为某一值的路径
 * 
 * 114/114 cases passed (9 ms)
 * Your runtime beats 2.77 % of java submissions
 * Your memory usage beats 5.01 % of java submissions (45.7 MB)
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



/*
// @lcpr case=start
// [5,4,8,11,null,13,4,7,2,null,null,5,1]\n22\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3]\n5\n
// @lcpr case=end

// @lcpr case=start
// [1,2]\n0\n
// @lcpr case=end

 */

