/*
 * @lc app=leetcode.cn id=1382 lang=java
 * @lcpr version=21908
 *
 * [1382] 将二叉搜索树变平衡
 * 
 * 17/17 cases passed (3 ms)
 * Your runtime beats 33.68 % of java submissions
 * Your memory usage beats 57.2 % of java submissions (44.7 MB)
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

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
    List<Integer> list = new ArrayList<>();

    public TreeNode balanceBST(TreeNode root) {
        travel(root);
        return dfs(new TreeNode(), 0, list.size() - 1);
    }
    TreeNode dfs(TreeNode root, int start, int end) {
        if (end >= list.size()) return null;
        if (start > end) return null;
        int mid = (start + end) / 2;
        // System.out.println(mid);
        root.val = list.get(mid);
        root.left = dfs(new TreeNode(), start, mid - 1);
        root.right = dfs(new TreeNode(), mid + 1, end);
        return root;
    }
    void travel(TreeNode root) {
        if (root == null) return;
        travel(root.left);
        list.add(root.val);
        travel(root.right);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,null,2,null,3,null,4,null,null]\n
// @lcpr case=end

// @lcpr case=start
// [2,1,3]\n
// @lcpr case=end

// @lcpr case=start
// [2,1]\n
// @lcpr case=end

// @lcpr case=start
// [1]\n
// @lcpr case=end


// @lcpr case=start
// [2,1,3]\n
// @lcpr case=end
 */

