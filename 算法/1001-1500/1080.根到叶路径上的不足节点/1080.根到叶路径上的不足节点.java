/*
 * @lc app=leetcode.cn id=1080 lang=java
 * @lcpr version=
 *
 * [1080] 根到叶路径上的不足节点
 * 
 * 117/117 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 5.03 % of java submissions (43.7 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Solution {
    public TreeNode sufficientSubset(TreeNode root, int limit) {
        if (root == null) return null;
        if (root.left == null && root.right == null) {
            if (root.val < limit) return null;
            return root;
        }
        root.left = sufficientSubset(root.left, limit - root.val);
        root.right = sufficientSubset(root.right, limit - root.val);
        if (root.left == null && root.right == null) return null;
        return root;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,4,-99,-99,7,8,9,-99,-99,12,13,-99,14]\n1\n
// @lcpr case=end

// @lcpr case=start
// [5,4,8,11,null,17,4,7,1,null,null,5,3]\n22\n
// @lcpr case=end

// @lcpr case=start
// [1,2,-3,-5,null,4,null]\n-1\n
// @lcpr case=end

 */

