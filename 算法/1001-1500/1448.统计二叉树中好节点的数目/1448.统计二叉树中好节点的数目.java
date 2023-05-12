/*
 * @lc app=leetcode.cn id=1448 lang=java
 * @lcpr version=21907
 *
 * [1448] 统计二叉树中好节点的数目
 * 
 * 63/63 cases passed (2 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 83.18 % of java submissions (49 MB)
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
    public int goodNodes(TreeNode root) {
        dfs(root, root.val);
        return ans;
    }
    void dfs(TreeNode root, int max) {
        if (root == null) return;
        if (root.val >= max) ans++;
        dfs(root.left, Math.max(max, root.val));
        dfs(root.right, Math.max(max, root.val));
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,1,4,3,null,1,5]\n
// @lcpr case=end

// @lcpr case=start
// [3,3,null,4,2]\n
// @lcpr case=end

// @lcpr case=start
// [1]\n
// @lcpr case=end

 */

