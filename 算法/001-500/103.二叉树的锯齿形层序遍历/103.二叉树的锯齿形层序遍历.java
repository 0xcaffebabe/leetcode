import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=103 lang=java
 *
 * [103] 二叉树的锯齿形层序遍历
 * 
 * 33/33 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 78.37 % of java submissions (40 MB)
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
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        travel(root, 0);
        return ans;
    }
    void travel(TreeNode root, int level) {
        if (root == null) return;
        if (ans.size() - 1 < level) ans.add(new LinkedList<>());
        var list = (LinkedList<Integer>)ans.get(level);

        if (level % 2 == 0) list.addLast(root.val);
        else list.addFirst(root.val);

        travel(root.left, level + 1);
        travel(root.right, level + 1);
    }
}
// @lc code=end

