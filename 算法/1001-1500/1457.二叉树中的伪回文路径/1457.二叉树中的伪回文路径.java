/*
 * @lc app=leetcode.cn id=1457 lang=java
 * @lcpr version=21909
 *
 * [1457] 二叉树中的伪回文路径
 * 
 * 56/56 cases passed (19 ms)
 * Your runtime beats 19.84 % of java submissions
 * Your memory usage beats 18.25 % of java submissions (67.6 MB)
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
    public int pseudoPalindromicPaths (TreeNode root) {
        dfs(root, new int[10]);
        return ans;
    }
    void dfs(TreeNode root, int[] map) {
        if (root == null) return;
        map[root.val]++;
        if (map[root.val] == 2) map[root.val] = 0;
        if (root.left == null && root.right == null) {
            int sum = 0;
            for(int i = 1; i <= 9; i++) sum += map[i];
            if (sum <= 1) ans++;
        }
        int[] lmap = new int[10];
        int[] rmap = new int[10];
        System.arraycopy(map, 0, lmap, 0, 10);
        System.arraycopy(map, 0, rmap, 0, 10);
        dfs(root.left, lmap);
        dfs(root.right, rmap);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,3,1,3,1,null,1]\n
// @lcpr case=end

// @lcpr case=start
// [2,1,1,1,3,null,null,null,null,null,1]\n
// @lcpr case=end

// @lcpr case=start
// [9]\n
// @lcpr case=end

 */

