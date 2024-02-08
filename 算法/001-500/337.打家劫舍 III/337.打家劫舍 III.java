/*
 * @lc app=leetcode.cn id=337 lang=java
 * @lcpr version=
 *
 * [337] 打家劫舍 III
 * 
 * 124/124 cases passed (2 ms)
 * Your runtime beats 39.58 % of java submissions
 * Your memory usage beats 8 % of java submissions (43 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.HashMap;
import java.util.Map;

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
    Map<TreeNode, Integer> sums = new HashMap<>();
    public int rob(TreeNode root) {
        if (root == null) return 0;
        if (sums.containsKey(root)) return sums.get(root);

        int a = root.val; // 偷取该节点的收益
        int b = 0; // 不偷该节点的收益
        if (root.left != null) 
            a += rob(root.left.left) + rob(root.left.right);
        if (root.right != null) 
            a += rob(root.right.left) + rob(root.right.right);
        b = rob(root.left) + rob(root.right);
        sums.put(root, Math.max(a,b));
        return Math.max(a,b);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,2,3,null,3,null,1]\n
// @lcpr case=end

// @lcpr case=start
// [3,4,5,1,3,null,1]\n
// [1,2,3]\n
// [1,2]\n
// [1]\n
// [2,1,3,null,4] \n
// @lcpr case=end

 */

