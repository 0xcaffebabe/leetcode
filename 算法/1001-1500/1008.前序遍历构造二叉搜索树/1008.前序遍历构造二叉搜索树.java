/*
 * @lc app=leetcode.cn id=1008 lang=java
 *
 * [1008] 前序遍历构造二叉搜索树
 * 
 * 111/111 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 10.4 % of java submissions (39.9 MB)
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
    private int[] preorder;
    public TreeNode bstFromPreorder(int[] preorder) {
        this.preorder = preorder;
        return travel(0, preorder.length - 1);
    }

    private TreeNode travel(int start, int end) {
        if (start >= preorder.length 
            || start < 0
            || end >= preorder.length
            || end < 0
            || start > end
        ) return null;
        var node = new TreeNode(preorder[start]);
        int l = start + 1;
        int r = -1;
        for(int i = start; i <= end; i++) {
            if (preorder[i] > node.val) {
                r = i;
                break;
            }
        }
        if (r == -1) {
            node.left = travel(l, end);
        }else {
            node.left = travel(l, r - 1);
            node.right = travel(r, end);
        }
        return node;
    }

}
// @lc code=end

