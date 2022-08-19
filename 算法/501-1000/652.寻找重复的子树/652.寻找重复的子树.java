import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=652 lang=java
 *
 * [652] 寻找重复的子树
 * 
 * 176/176 cases passed (21 ms)
 * Your runtime beats 40.25 % of java submissions
 * Your memory usage beats 28.44 % of java submissions (48.9 MB)
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
    Map<String, Integer> map = new HashMap<>();
    List<TreeNode> ans = new ArrayList<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        dfs(root);
        return ans;
    }
    String dfs(TreeNode root) {
        if (root == null) return "#";
        String serialStr = String.format("%s,%s,%s", root.val  + "", dfs(root.left), dfs(root.right));
        map.put(serialStr, map.getOrDefault(serialStr, 0) + 1);
        if (map.get(serialStr) == 2) ans.add(root);
        return serialStr;
    }
}
// @lc code=end

