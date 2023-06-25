/*
 * @lc app=leetcode.cn id=1339 lang=java
 * @lcpr version=21909
 *
 * [1339] 分裂二叉树的最大乘积
 * 
 * 54/54 cases passed (9 ms)
 * Your runtime beats 53.65 % of java submissions
 * Your memory usage beats 71.36 % of java submissions (54.8 MB)
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

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
    @Override
    public String toString() {
        return val + "";
    }
}
class Solution {
    long max;
    long all;
    public int maxProduct(TreeNode root) {
        dfs(root);
        dfs0(root);
        return (int) (max % 1000000007);
    }

    void dfs(TreeNode root) {
        if (root == null) return;
        all += root.val;
        dfs(root.left);
        dfs(root.right);
    }

    long dfs0(TreeNode root) {
        if (root == null) return 0;
        var left = dfs0(root.left);
        var right = dfs0(root.right);
        max = Math.max(max, (all - left) * left);
        max = Math.max(max, (all - right) * right);
        return left + right + root.val;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [5,6,6,null,null,8,6,10,null,5]
// @lcpr case=end

// @lcpr case=start
// [1,2,3,4,5,6]\n
// @lcpr case=end

// @lcpr case=start
// [1,null,2,3,4,null,null,5,6]\n
// @lcpr case=end

// @lcpr case=start
// [2,3,9,10,7,8,6,5,4,11,1]\n
// @lcpr case=end

// @lcpr case=start
// [1,1]\n
// @lcpr case=end

 */

