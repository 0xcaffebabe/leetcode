/*
 * @lc app=leetcode.cn id=2415 lang=java
 * @lcpr version=21907
 *
 * [2415] 反转二叉树的奇数层
 * 
 * 57/57 cases passed (15 ms)
 * Your runtime beats 16.75 % of java submissions
 * Your memory usage beats 11 % of java submissions (48.3 MB)
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

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
    List<List<TreeNode>> list = new ArrayList<>();
    public TreeNode reverseOddLevels(TreeNode root) {
        dfs(root, 0);
        for(int i = 1; i < list.size(); i += 2) {
            var row = list.get(i);
            int n = row.size() / 2;
            for(int j = 0; j < n; j++) {
                int t = row.get(j).val;
                row.get(j).val = row.get(row.size() - 1 - j).val;
                row.get(row.size() - 1 - j).val = t;
            }
        }
        return root;
    }

    void dfs(TreeNode root, int level) {
        if (root == null) return;
        if (list.size() <= level) list.add(new ArrayList<>());
        list.get(level).add(root);
        dfs(root.left, level + 1);
        dfs(root.right, level + 1);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,3,5,8,13,21,34]\n
// @lcpr case=end

// @lcpr case=start
// [7,13,11]\n
// @lcpr case=end

// @lcpr case=start
// [0,1,2,0,0,0,0,1,1,1,1,2,2,2,2]\n
// @lcpr case=end

 */

