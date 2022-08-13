import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=95 lang=java
 *
 * [95] 不同的二叉搜索树 II
 * 
 * 8/8 cases passed (1 ms)
 * Your runtime beats 97.47 % of java submissions
 * Your memory usage beats 91.54 % of java submissions (41.6 MB)
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
    ArrayList<TreeNode> EMPTY_LIST = new ArrayList<>();
    {
        EMPTY_LIST.add(null);
    }
    public List<TreeNode> generateTrees(int n) {
        return travel(1, n);
    }
    List<TreeNode> travel(int start, int end) {
        if (start > end) return EMPTY_LIST;
        List<TreeNode> treeList = new ArrayList<>();
        for(int i = start; i <= end; i++) {
            var leftList = travel(start, i - 1);
            var rightList = travel(i + 1, end);
            for(var left: leftList) {
                for(var right: rightList) {
                    TreeNode tree = new TreeNode(i, left, right);
                    treeList.add(tree);
                }
            }
        }
        return treeList;
    }
}
// @lc code=end

