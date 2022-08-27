import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=662 lang=java
 *
 * [662] 二叉树最大宽度
 * 
 * 114/114 cases passed (2 ms)
 * Your runtime beats 25.95 % of java submissions
 * Your memory usage beats 66.14 % of java submissions (40.9 MB)
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
    List<List<Integer>> tmp = new ArrayList<>();
    public int widthOfBinaryTree(TreeNode root) {
        tmp.add(Arrays.asList(1));
        dfs(root.left, 1, 1, true);
        dfs(root.right, 1, 1, false);
        // System.out.println(tmp);
        int ans = 1;
        for(var arr: tmp) {
            ans = Math.max(ans, arr.get(arr.size() - 1) - arr.get(0) + 1);
        }
        return ans;
    }
    void dfs(TreeNode root, int val, int level, boolean left) {
        if (root == null) return;
        if (tmp.size() <= level) tmp.add(new ArrayList<>());
        if (left) {
            tmp.get(level).add(val * 2);
            dfs(root.left, val * 2, level + 1, true);
            dfs(root.right, val * 2, level + 1, false);
        } else {
            tmp.get(level).add(val * 2 + 1);
            dfs(root.left, val * 2 + 1, level + 1, true);
            dfs(root.right, val * 2 + 1, level + 1, false);
        }
    }
}
// @lc code=end

