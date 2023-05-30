/*
 * @lc app=leetcode.cn id=1110 lang=java
 * @lcpr version=21908
 *
 * [1110] 删点成林
 * 
 * 111/111 cases passed (1 ms)
 * Your runtime beats 90.65 % of java submissions
 * Your memory usage beats 16.99 % of java submissions (42.8 MB)
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
    List<TreeNode> ans = new ArrayList<>();
    Set<Integer> set = new HashSet<>();
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        for(var i : to_delete) set.add(i);
        dfs(root);
        if (!set.contains(root.val)) ans.add(root);
        return ans;
    }
    TreeNode dfs(TreeNode root) {
        if (root == null) return null;
        root.left = dfs(root.left);
        root.right = dfs(root.right);
        if (set.contains(root.val)) {
            if (root.left != null) ans.add(root.left);
            if (root.right != null) ans.add(root.right);
            return null;
        }
        return root;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,4,5,6,7]\n[3,5]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,4,null,3]\n[3]\n
// @lcpr case=end

 */

