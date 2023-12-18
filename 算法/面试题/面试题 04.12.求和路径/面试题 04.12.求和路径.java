/*
 * @lc app=leetcode.cn id=面试题 04.12 lang=java
 * @lcpr version=
 *
 * [面试题 04.12] 求和路径
 * 
 * 114/114 cases passed (7 ms)
 * Your runtime beats 66.45 % of java submissions
 * Your memory usage beats 91.05 % of java submissions (39.9 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
class Solution {
    int ans = 0;
    public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;
        dfs(root, sum);
        pathSum(root.left, sum);
        pathSum(root.right, sum);
        return ans;
    }

    void dfs(TreeNode root, int sum) {
        if (root == null) return;
        sum -= root.val;
        if (sum == 0) ans++;
        dfs(root.left, sum);
        dfs(root.right, sum);
    }
}
// @lc code=end


/*
// @lcpr case=start
// [5,4,8,11,null,13,4,7,2,null,null,5,1]\n22\n
// [5,4,8]\n4\n
// [5,4,8]\n9\n
// [5,4,8]\n0\n
// [5,4,0]\n0\n
// [1,-1,1]\n0\n
// [1,-1,9]\n0\n
// @lcpr case=end


 */

