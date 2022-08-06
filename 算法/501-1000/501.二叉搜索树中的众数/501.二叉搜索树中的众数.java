import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=501 lang=java
 *
 * [501] 二叉搜索树中的众数
 * 
 * 23/23 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 46.65 % of java submissions (42 MB)
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
    int base = Integer.MIN_VALUE;
    int count = 0;
    int maxCount = 0;
    ArrayList<Integer> ans = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        travel(root);
        int[] ret = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++) ret[i] = ans.get(i);
        return ret;
    }

    void update(int val) {
        if (base != val) {
            base = val;
            count = 1;
        }else if (base == val) {
            count++;
        }
            
        if (count == maxCount) ans.add(val);

        if (count > maxCount) {
            maxCount = count;
            ans = new ArrayList<>();
            ans.add(val);
        }

    }

    void travel(TreeNode root) {
        if (root == null) return;
        travel(root.left);
        update(root.val);
        travel(root.right);
    }
}
// @lc code=end

