import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=655 lang=java
 *
 * [655] 输出二叉树
 * 
 * 73/73 cases passed (1 ms)
 * Your runtime beats 90.29 % of java submissions
 * Your memory usage beats 60.84 % of java submissions (41.6 MB)
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
    int height;
    List<List<String>> ans = new ArrayList<>();
    int m;
    int n;

    public List<List<String>> printTree(TreeNode root) {
        dfsH(root, 0);
        m = height + 1;
        n = (int) (Math.pow(2, height + 1) - 1);
        for(int i = 0; i < m; i++) {
            List<String> list = new ArrayList<>();
            for(int j = 0; j < n; j++) list.add("");
            ans.add(list);
        }
        dfsA(root, 0, (n - 1) / 2);
        return ans;
    }

    void dfsA(TreeNode root, int r, int c) {
        if (root == null) return;
        ans.get(r).set(c, root.val + "");
        dfsA(root.left, r + 1, c - (int)Math.pow(2, height-r-1));
        dfsA(root.right, r + 1, c + (int)Math.pow(2, height-r-1));
    }

    void dfsH(TreeNode root, int level) {
        if (root == null) return;
        height = Math.max(height, level);
        dfsH(root.left, level + 1);
        dfsH(root.right, level + 1);
    }
}
// @lc code=end

