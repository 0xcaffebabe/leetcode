import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=1161 lang=java
 *
 * [1161] 最大层内元素和
 * 
 * 40/40 cases passed (6 ms)
 * Your runtime beats 95.68 % of java submissions
 * Your memory usage beats 72.44 % of java submissions (44.2 MB)
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
    List<Integer> tmp = new ArrayList<>();
    {
        tmp.add(0);
    }
    public int maxLevelSum(TreeNode root) {
        dfs(root, 0);
        int maxIndex = -1;
        int max = Integer.MIN_VALUE;
        // System.out.println(tmp);
        for(int i = 0; i < tmp.size(); i++) {
            if (tmp.get(i) > max) {
                max = tmp.get(i);
                maxIndex = i;
            }
        }
        return maxIndex + 1;
    }

    void dfs(TreeNode root, int level) {
        if (root == null) return;
        if (tmp.size() <= level) tmp.add(0);
        tmp.set(level, tmp.get(level) + root.val);
        dfs(root.left, level + 1);
        dfs(root.right, level + 1);
    }
}
// @lc code=end

