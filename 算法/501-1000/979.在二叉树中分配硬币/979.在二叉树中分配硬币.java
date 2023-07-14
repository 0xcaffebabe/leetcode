/*
 * @lc app=leetcode.cn id=979 lang=java
 * @lcpr version=21909
 *
 * [979] 在二叉树中分配硬币
 * 
 * 148/148 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 48.85 % of java submissions (40 MB)
 */

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
    int ans = 0;
    public int distributeCoins(TreeNode root) {
        dfs(root);
        return ans;
    }

    int dfs(TreeNode root) {
        if (root == null) return 0;
        if (root.left != null)  root.val += dfs(root.left);
        if (root.right != null)  root.val += dfs(root.right);
        ans += Math.abs(root.val - 1);
        return root.val - 1;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,0,0]\n
// @lcpr case=end

// @lcpr case=start
// [0,3,0]\n
// @lcpr case=end

// @lcpr case=start
// [1,0,2]\n
// @lcpr case=end

// @lcpr case=start
// [1,0,0,null,3]\n
// @lcpr case=end

 */

