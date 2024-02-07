/*
 * @lc app=leetcode.cn id=2641 lang=java
 * @lcpr version=
 *
 * [2641] 二叉树的堂兄弟节点 II
 * 
 * 41/41 cases passed (34 ms)
 * Your runtime beats 26.86 % of java submissions
 * Your memory usage beats 6.29 % of java submissions (86.4 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
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
    private List<Integer> levelMap = new ArrayList<>();
    public TreeNode replaceValueInTree(TreeNode root) {
        dfs(root, 0);
        // System.out.println(Arrays.toString(levelMap));
        dfs1(root, 0);
        root.val = 0;
        return root;
    }

    void dfs1(TreeNode root, int level) {
        if (root == null) return;
        var oriLeft = 0;
        if (root.left != null) oriLeft = root.left.val;
        var oriRight = 0;
        if (root.right != null) oriRight = root.right.val;

        if (root.left != null) {
            var val = levelMap.get(level + 1);
            val -= oriRight;
            val -= root.left.val;
            root.left.val = val;
        }
        if (root.right != null) {
            var val = levelMap.get(level + 1);
            val -= oriLeft;
            val -= root.right.val;
            // System.out.println(val + "|" + root.right.val + "|" + root.left.val);
            root.right.val = val;
        }
        dfs1(root.left, level + 1);
        dfs1(root.right, level + 1);
    }

    void dfs(TreeNode root, int level) {
        if (root == null) return;
        if (levelMap.size() <= level) levelMap.add(0);
        levelMap.set(level,  levelMap.get(level) + root.val);
        dfs(root.left, level + 1);
        dfs(root.right, level + 1);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [5,4,9,1,10,null,7]\n
// [5,4,9,1,10,null,7,1,2,3]\n
// [5,4,9,1,10,null,7,1,2,3,null,null,null,1,null,null,3]\n
// [1,2,3]\n
// [1,2]\n
// [1]\n
// @lcpr case=end

// @lcpr case=start
// [3,1,2]\n
// @lcpr case=end

 */

