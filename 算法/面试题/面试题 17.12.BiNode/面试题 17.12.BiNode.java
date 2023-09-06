/*
 * @lc app=leetcode.cn id=面试题 17.12 lang=java
 * @lcpr version=
 *
 * [面试题 17.12] BiNode
 * 
 * 34/34 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 92.9 % of java submissions (46.7 MB)
 */

// @lc code=start
class TreeNode {
   int val;
   TreeNode left;
   TreeNode right;
   TreeNode(int x) { val = x; }
}

class Solution {
    TreeNode prev = new TreeNode(0);
    public TreeNode convertBiNode(TreeNode root) {
        var ori = prev;
        dfs(root);
        return ori.right;
    }
    void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.left);
        prev.right = root;
        prev = root;
        prev.left = null;
        dfs(root.right);
    }

}
// @lc code=end



/*
// @lcpr case=start
// [4,2,5,1,3,null,6,0]\n
// [4]\n
// [1,2,3]\n
// [1,2]\n
// [1,null,2,null,3]\n
// [1,null,2]
// @lcpr case=end

 */

