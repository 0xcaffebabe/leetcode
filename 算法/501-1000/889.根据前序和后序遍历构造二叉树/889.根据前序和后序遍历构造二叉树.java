/*
 * @lc app=leetcode.cn id=889 lang=java
 * @lcpr version=
 *
 * [889] 根据前序和后序遍历构造二叉树
 * 
 * 306/306 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 5.08 % of java submissions (42.4 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Solution {
    int[] preorder;
    int[] postorder;
    int pre = 0;
    int post = 0;
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        this.preorder = preorder;
        this.postorder = postorder;
        return dfs();
    }

    TreeNode dfs() {
        if (pre >= preorder.length || post >= postorder.length) return null;
        var node = new TreeNode(preorder[pre++]);
        if (node.val != postorder[post])
            node.left = dfs();
        if (node.val != postorder[post])
            node.right = dfs();
        post++;
        return node;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,4,5,3,6,7]\n[4,5,2,6,7,3,1]\n
// [1,4,3,2,5,6]\n[5,6,2,3,4,1]\n
// [1]\n[1]\n
// [1,2]\n[2,1]\n
// @lcpr case=end

// @lcpr case=start
// [1]\n[1]\n
// @lcpr case=end

 */

