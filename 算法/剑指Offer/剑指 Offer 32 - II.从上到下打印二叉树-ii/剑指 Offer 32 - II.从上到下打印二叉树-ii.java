/*
 * @lc app=leetcode.cn id=剑指 Offer 32 - II lang=java
 * @lcpr version=21907
 *
 * [剑指 Offer 32 - II] 从上到下打印二叉树 II
 * 
 * 34/34 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 98.03 % of java submissions (40.9 MB)
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private List<List<Integer>> ans = new ArrayList<>(16);
    public List<List<Integer>> levelOrder(TreeNode root) {
        travel(root, 0);
        return ans;
    }

    private void travel(TreeNode root, int level) {
        if (root == null) return;
        if (ans.size() <= level) ans.add(new ArrayList<>());
        ans.get(level).add(root.val);
        travel(root.left, level + 1);
        travel(root.right, level + 1);
    }
}
// @lc code=end

/*
// @lcpr case=start
// [3,9,20,null,null,15,7]\n
// @lcpr case=end

 */

