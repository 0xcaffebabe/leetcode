/*
 * @lc app=leetcode.cn id=剑指 Offer II 053 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 053] 二叉搜索树中的中序后继
 * 
 * 24/24 cases passed (4 ms)
 * Your runtime beats 35.85 % of java submissions
 * Your memory usage beats 24.39 % of java submissions (42.6 MB)
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
class Solution {
    List<TreeNode> list = new ArrayList<>();
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        trv(root);
        for(int i = 1; i < list.size(); i++)
            if (list.get(i - 1) == p) return list.get(i);
        return null;
    }
    void trv(TreeNode root) {
        if (root == null) return;
        trv(root.left);
        list.add(root);
        trv(root.right);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,1,3]\n1\n
// @lcpr case=end

// @lcpr case=start
// [5,3,6,2,4,null,null,1]\n6\n
// @lcpr case=end


 */

