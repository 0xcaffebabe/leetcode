/*
 * @lc app=leetcode.cn id=剑指 Offer 07 lang=java
 * @lcpr version=21907
 *
 * [剑指 Offer 07] 重建二叉树
 * 
 * 203/203 cases passed (3 ms)
 * Your runtime beats 36.81 % of java submissions
 * Your memory usage beats 11.72 % of java submissions (42.3 MB)
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int[] preorder;
    int[] inorder;
    int pos = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) return null;

        this.preorder = preorder;
        this.inorder = inorder;
        return travel(0, inorder.length - 1);
    }
    TreeNode travel(int start, int end) {
        if (start > end) return null;
        if (start < 0 || end >= inorder.length) return null;
        int rootVal = preorder[pos++];
        // System.out.println(rootVal);
        int rootIndex = -1;
        for(int i = start; i <= end; i++) {
            if (inorder[i] == rootVal) {
                rootIndex = i;
                break;
            }
        }

        return new TreeNode(rootVal, travel(start, rootIndex - 1), travel(rootIndex + 1, end));
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,9,20,15,7]\n[9,3,15,20,7]\n
// @lcpr case=end

// @lcpr case=start
// [-1]\n[-1]\n
// @lcpr case=end

 */

