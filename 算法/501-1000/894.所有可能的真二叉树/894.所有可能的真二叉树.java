import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=894 lang=java
 *
 * [894] 所有可能的真二叉树
 * 
 * 20/20 cases passed (3 ms)
 * Your runtime beats 19.59 % of java submissions
 * Your memory usage beats 40.71 % of java submissions (43.5 MB)
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
    public List<TreeNode> allPossibleFBT(int n) {
        List<TreeNode> ans = new ArrayList<>();
        if (n == 1) {
            return Arrays.asList(new TreeNode(0));
        }
        for(int i = 1; i < n - 1; i += 2) {
            var leftList = allPossibleFBT(i);
            var rightList = allPossibleFBT(n - i - 1);
            for(var left: leftList) {
                for(var right: rightList ) {
                    ans.add(new TreeNode(0, left, right));
                }
            }
        }
        return ans;
    }
}
// @lc code=end

